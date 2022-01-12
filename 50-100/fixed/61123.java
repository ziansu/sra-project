@java.lang.Override
public void handleMethodTranslateException(com.googlecode.d2j.Method method, com.googlecode.d2j.node.DexMethodNode methodNode, org.objectweb.asm.MethodVisitor mv, java.lang.Exception e) {
    java.io.StringWriter s = new java.io.StringWriter();
    s.append("d2j fail translate: ");
    e.printStackTrace(new java.io.PrintWriter(s));
    java.lang.String msg = s.toString();
    mv.visitTypeInsn(Opcodes.NEW, "java/lang/RuntimeException");
    mv.visitInsn(Opcodes.DUP);
    mv.visitLdcInsn(msg);
    mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V");
    mv.visitInsn(Opcodes.ATHROW);
}