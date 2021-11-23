private void writeConstructor() {
    org.renjin.repackaged.asm.MethodVisitor mv = cv.visitMethod(org.renjin.compiler.pipeline.ACC_PUBLIC, "<init>", "()V", null, null);
    mv.visitCode();
    mv.visitVarInsn(org.renjin.compiler.pipeline.ALOAD, 0);
    mv.visitMethodInsn(org.renjin.compiler.pipeline.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
    mv.visitInsn(org.renjin.compiler.pipeline.RETURN);
    mv.visitMaxs(1, 1);
    mv.visitEnd();
}