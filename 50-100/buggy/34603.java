@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
protected void visitEndOfMethod(org.apache.xbean.asm5.MethodVisitor mv, java.lang.String desc) {
    java.lang.String preMasterType = "Ljavax/crypto/SecretKey;";
    if (className.endsWith("/PreMasterSecret")) {
        preMasterType = "[B";
    }
    mv.visitVarInsn(org.apache.xbean.asm5.Opcodes.ALOAD, 0);
    mv.visitFieldInsn(org.apache.xbean.asm5.Opcodes.GETFIELD, className, "encrypted", "[B");
    mv.visitVarInsn(org.apache.xbean.asm5.Opcodes.ALOAD, 0);
    mv.visitFieldInsn(org.apache.xbean.asm5.Opcodes.GETFIELD, className, "preMaster", preMasterType);
    mv.visitMethodInsn(org.apache.xbean.asm5.Opcodes.INVOKESTATIC, className, "$LogWriter$logRSA", (("([B" + preMasterType) + ")V"));
}