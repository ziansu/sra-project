private void addToscaArchive(java.nio.file.Path path) {
    java.nio.file.Path relativePath = rootPath.relativize(path);
    java.nio.file.Path zipPath = zipRootPath.resolve(relativePath).resolve("archive.zip");
    try {
        alien4cloud.utils.FileUtil.zip(path, zipPath);
        toscaArchives.add(zipPath);
    } catch (java.io.IOException e) {
        throw new alien4cloud.exception.GitException("Failed to zip archives in order to import them.", e);
    }
}