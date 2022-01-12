private void loadWordsFromFile(java.util.Set<java.lang.String> words, java.nio.file.Path file) {
    try (java.util.stream.Stream<java.lang.String> lines = java.nio.file.Files.lines(file, java.nio.charset.StandardCharsets.ISO_8859_1)) {
        lines.map(( line) -> line.trim().toLowerCase()).forEach(( word) -> words.add(word));
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}