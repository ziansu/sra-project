private void addSubtitles(java.util.List<java.nio.file.Path> subtitles, java.nio.file.Path directory) throws java.io.IOException {
    java.util.List<java.nio.file.Path> files = java.nio.file.Files.walk(directory).filter(java.nio.file.Files::isRegularFile).collect(java.util.stream.Collectors.toList());
    for (java.nio.file.Path tmpFile : files) {
        for (java.lang.String subtitleExtension : subtitleExtensions) {
            if (tmpFile.toString().endsWith(subtitleExtension)) {
                subtitles.add(tmpFile);
                break;
            }
        }
    }
}