public static java.util.List<java.lang.String> findQuotes(java.util.List<java.lang.String> paths, java.lang.CharSequence sequence) {
    return paths.stream().flatMap(( file) -> {
        try {
            return java.nio.file.Files.lines(java.nio.file.Paths.get(file));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return null;
    }).filter(( str) -> str.contains(sequence)).collect(java.util.stream.Collectors.toList());
}