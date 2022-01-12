private void importFiles() {
    if (fileMap.isEmpty()) {
        return ;
    }
    importFile(fileMap.firstEntry().getValue());
    fileMap.remove(fileMap.firstKey());
}