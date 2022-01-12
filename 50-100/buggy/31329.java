public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) {
    if ((file.toString().endsWith(".json")) || (file.toString().endsWith(".txt"))) {
        java.lang.System.out.println(mDocumentID);
        GuiMain.fileNames.add(file.getFileName().toString());
        GuiMain.indexFile(file.toFile(), GuiMain.index, mDocumentID, GuiMain.bindex);
        (mDocumentID)++;
    }
    return java.nio.file.FileVisitResult.CONTINUE;
}