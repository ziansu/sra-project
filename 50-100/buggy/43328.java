public static char[][] read(java.lang.String filename) {
    try {
        return java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filename)).stream().skip(1).filter(( line) -> (line.length()) > 1).map(java.lang.String::toCharArray).toArray(char[][]::new);
    } catch (java.lang.Exception e) {
        return null;
    }
}