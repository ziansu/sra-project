public void sync(java.nio.file.Path source, java.nio.file.Path destination) {
    try {
        java.nio.file.Files.walkFileTree(source, new MyCopier(source, destination));
        java.nio.file.Files.walkFileTree(destination, new MyCleaner(source, destination));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}