public static boolean deleteFile(java.io.File file) {
    org.ijsberg.iglu.util.io.FileSupport.deleteContentsInDirectoryTree(file, null);
    return file.delete();
}