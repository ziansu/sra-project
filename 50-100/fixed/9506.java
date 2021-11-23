public static void main(java.lang.String[] args) throws java.io.IOException {
    org.spongepowered.despector.source.ast.SourceFileSet set = new org.spongepowered.despector.source.ast.SourceFileSet();
    java.io.File f = new java.io.File("src/main/java/org/spongepowered/despector/Despector.java");
    java.lang.String input = new java.lang.String(java.nio.file.Files.readAllBytes(f.toPath()), com.google.common.base.Charsets.UTF_8);
    SourceParsers.JAVA.parse(set, "org/spongepowered/despector/Despector.java", input);
}