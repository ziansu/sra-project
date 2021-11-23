private void importFiles() {
    if ((fileMap.size()) == 0) {
        return ;
    }
    importFile(fileMap.firstEntry().getValue());
    fileMap.remove(fileMap.firstKey());
}