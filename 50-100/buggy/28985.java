@java.lang.Override
public boolean replace(java.lang.String pathToImage) {
    java.nio.file.Path source = java.nio.file.Paths.get(pathToImage);
    java.nio.file.Path target = java.nio.file.Paths.get(this.fullPath);
    if ((java.nio.file.Files.exists(source)) && (java.nio.file.Files.exists(target))) {
        try {
            java.nio.file.Files.copy(source, target, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (java.io.IOException e) {
            return false;
        }
    }
    return false;
}