@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    alien4cloud.utils.FileUtil.putZipEntry(zipOutputStream, new java.util.zip.ZipEntry(alien4cloud.utils.FileUtil.getChildEntryRelativePath(inputPath, file, true)), file);
    return java.nio.file.FileVisitResult.CONTINUE;
}