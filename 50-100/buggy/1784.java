public static void write(java.lang.String text, java.lang.String url) {
    java.lang.String input = text;
    java.nio.file.Path path = java.nio.file.Paths.get(url);
    try (java.io.Writer output = java.nio.file.Files.newBufferedWriter(path, java.nio.charset.StandardCharsets.UTF_8)) {
        while ((input.trim().length()) > 0) {
            output.write(input);
        } 
    } catch (java.io.IOException ex) {
        java.lang.System.out.println("Path not found.");
        ex.printStackTrace(java.lang.System.err);
    }
}