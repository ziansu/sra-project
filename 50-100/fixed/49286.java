public static org.basex.query.value.Value filewalk(final java.lang.String path, final org.basex.query.value.map.Map options) throws java.io.IOException {
    java.nio.file.Path startingDir = java.nio.file.Paths.get(path);
    java.util.EnumSet<java.nio.file.FileVisitOption> opts = java.util.EnumSet.of(java.nio.file.FileVisitOption.FOLLOW_LINKS);
    com.quodatum.file.Walker walk = new com.quodatum.file.Walker(options);
    java.nio.file.Files.walkFileTree(startingDir, opts, java.lang.Integer.MAX_VALUE, walk);
    return walk.result();
}