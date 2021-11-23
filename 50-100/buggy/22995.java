@java.lang.Override
public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path dir, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    if (!(dir.equals(basePath))) {
        tarArchiveOutputStream.putArchiveEntry(new org.apache.commons.compress.archivers.tar.TarArchiveEntry(alien4cloud.utils.FileUtil.convertToLinuxPath(alien4cloud.utils.FileUtil.getChildEntryRelativePath(basePath, dir))));
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}