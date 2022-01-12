@java.lang.Override
public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path dir, java.io.IOException ex) throws java.io.IOException {
    final java.lang.String path_temp = dir.toString();
    final java.lang.String path_name = omnikryptec.util.AdvancedFile.getName(path_temp);
    if (((advancedFileFilter == null) || (advancedFileFilter.accept(ME, path_name))) && (recursiv || (dir.getParent().equals(myPathTest)))) {
        files.add(new omnikryptec.util.AdvancedFile(false, this, path_name));
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}