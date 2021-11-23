public java.lang.String decompile(byte[] b) {
    com.strobel.decompiler.PlainTextOutput pto = new com.strobel.decompiler.PlainTextOutput();
    java.lang.String classNameSlashes = extractClassNameSlashes(b);
    return decompileToString(classNameSlashes);
}