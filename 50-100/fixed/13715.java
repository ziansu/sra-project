public java.util.List<java.lang.String> compile(java.lang.String source, java.lang.String outputPath, boolean compilerFlag, boolean isRepl) {
    try {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(source);
        return compile(fileInputStream, outputPath, compilerFlag, isRepl);
    } catch (java.lang.Exception ex) {
        new com.juliar.errors.PrintError(ex.getMessage(), ex);
    }
    return new java.util.ArrayList<java.lang.String>();
}