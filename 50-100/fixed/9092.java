private java.lang.String getText(final org.objectweb.asm.tree.MethodNode mn) {
    org.objectweb.asm.util.Textifier tv = new org.objectweb.asm.util.Textifier();
    org.objectweb.asm.util.TraceMethodVisitor tmv = new org.objectweb.asm.util.TraceMethodVisitor(tv);
    mn.accept(tmv);
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (tv.text.size()); i++) {
        sb.append(tv.text.get(i));
    }
    return sb.toString();
}