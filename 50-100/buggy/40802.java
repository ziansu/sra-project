public boolean delete() {
    if (isDirectory()) {
        for (java.io.File currentFile : file.listFiles()) {
            com.mauriciotogneri.fileexplorer.utils.FileInfo fileInfo = new com.mauriciotogneri.fileexplorer.utils.FileInfo(currentFile);
            fileInfo.delete();
        }
    }
    return file.delete();
}