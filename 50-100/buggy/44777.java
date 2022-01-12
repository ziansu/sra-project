@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path sourceFile, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    final java.nio.file.Path destinationFile = destination.resolve(source.relativize(sourceFile));
    com.github.unafraid.plugins.installers.file.FileInstaller.LOGGER.debug("Copying file: {} -> {}", sourceFile, destinationFile);
    java.nio.file.Files.copy(java.nio.file.Files.newInputStream(sourceFile), destinationFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    com.github.unafraid.plugins.installers.file.FileInstaller.LOGGER.debug("Copied: {}", destinationFile);
    return java.nio.file.FileVisitResult.CONTINUE;
}