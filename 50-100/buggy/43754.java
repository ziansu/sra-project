private static java.util.List<java.lang.String> getImports(org.kohsuke.github.GHContent javaFile) throws java.io.IOException {
    japa.parser.ast.CompilationUnit cu;
    try {
        cu = japa.parser.JavaParser.parse(javaFile.read());
        ImportsPackage.ImportVisitor visitor = new ImportsPackage.ImportVisitor();
        visitor.visit(cu, null);
        return visitor.getImports();
    } catch (japa.parser.ParseException e) {
    }
    return null;
}