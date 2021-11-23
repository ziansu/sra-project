public static com.github.javaparser.ast.CompilationUnit parse(final java.io.Reader reader, boolean considerComments) throws com.github.javaparser.ParseException {
    try {
        java.lang.String comments = com.github.javaparser.SourcesHelper.readerToString(reader);
        com.github.javaparser.ast.CompilationUnit cu = new com.github.javaparser.InstanceJavaParser(reader).parse();
        if (considerComments) {
            com.github.javaparser.JavaParser.commentsInserter.insertComments(cu, comments);
        }
        return cu;
    } catch (java.io.IOException ioe) {
        throw new com.github.javaparser.ParseException(ioe.getMessage());
    }
}