private static boolean isMediaFile(java.nio.file.Path path) {
    return path.getFileName().endsWith(".mp3");
}