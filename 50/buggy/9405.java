public boolean prepareSelectedFiles() {
    if (prepareFiles()) {
        preparedFiles.addAll(selectedFiles.values());
        return true;
    }
    return false;
}