public java.lang.String decompile(byte[] b) {
    java.lang.String classNameSlashes = extractClassNameSlashes(b);
    return decompileToString(classNameSlashes);
}