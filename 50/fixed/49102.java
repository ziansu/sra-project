private static boolean isMediaFile(java.nio.file.Path path) {
    return path.getFileName().toString().endsWith(".mp3");
}