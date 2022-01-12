public static void walkFileTree(java.io.File directory, com.facebook.common.file.FileTreeVisitor visitor) {
    visitor.preVisitDirectory(directory);
    java.io.File[] files = directory.listFiles();
    if (files != null) {
        for (java.io.File file : files) {
            if ((file.isDirectory()) && (!(com.facebook.common.file.FileTree.isSymlink(file)))) {
                com.facebook.common.file.FileTree.walkFileTree(file, visitor);
            }else {
                visitor.visitFile(file);
            }
        }
    }
    visitor.postVisitDirectory(directory);
}