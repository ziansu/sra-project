public void setIncludeFilter(java.io.File filterFile) {
    if ((filterFile != null) && ((filterFile.length()) > 0)) {
        includeFile = filterFile;
    }else {
        if (filterFile != null) {
            log((("Warning: include filter file " + filterFile) + (filterFile.exists() ? " is empty" : " does not exist")));
        }
        includeFile = null;
    }
}