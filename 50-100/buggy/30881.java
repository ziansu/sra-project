public java.util.List<com.mauriciotogneri.fileexplorer.utils.FileInfo> files() {
    java.util.List<com.mauriciotogneri.fileexplorer.utils.FileInfo> result = new java.util.ArrayList<>();
    if (isDirectory()) {
        for (java.io.File currentFile : file.listFiles()) {
            com.mauriciotogneri.fileexplorer.utils.FileInfo fileInfo = new com.mauriciotogneri.fileexplorer.utils.FileInfo(currentFile);
            result.addAll(fileInfo.files());
        }
    }else {
        result.add(this);
    }
    return result;
}