public static java.nio.file.attribute.BasicFileAttributes getBasicFileAttributes(java.nio.file.Path path, java.nio.file.LinkOption... followLinks) {
    return org.xmlsh.util.FileUtils.getFileAttributes(path, java.nio.file.attribute.BasicFileAttributes.class, java.nio.file.attribute.BasicFileAttributeView.class, followLinks);
}