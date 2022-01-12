@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    final java.lang.String path_temp = file.toString();
    final java.lang.String path_name = omnikryptec.util.AdvancedFile.getName(path_temp);
    if (((advancedFileFilter == null) || (advancedFileFilter.accept(ME, path_name))) && (recursiv || (file.getParent().equals(myPathTest)))) {
        files.add(new omnikryptec.util.AdvancedFile(true, this, path_name));
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}