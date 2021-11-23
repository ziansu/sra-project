private void registerAll(java.nio.file.Path start) throws java.io.IOException {
    java.nio.file.Files.walk(start, java.nio.file.FileVisitOption.FOLLOW_LINKS).forEach(( path) -> {
        try {
            register(path);
        } catch (java.lang.Exception e) {
        }
    });
}