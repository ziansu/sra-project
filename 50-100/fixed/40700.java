public java.util.List<java.lang.String> searchDirectory(java.io.File directory, java.lang.String fileNameToSearch, boolean regex) {
    result = new java.util.ArrayList<java.lang.String>();
    setFileNameToSearch(fileNameToSearch);
    if (directory.isDirectory()) {
        if (regex) {
            wildCardSearch(directory);
        }else {
            search(directory);
        }
    }else {
        org.rgddallas.media.util.FileSearchService.log.debug("{} is not a directory!", directory.getAbsoluteFile());
    }
    return result;
}