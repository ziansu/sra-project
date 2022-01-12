private boolean matchesRequestedExtensions(java.lang.String fileName) {
    if ((extensions.size()) == 0) {
        return true;
    }else {
        java.lang.String[] tokens = fileName.split("\\.");
        java.lang.String thisExtension = tokens[((tokens.length) - 1)];
        return extensions.contains(thisExtension);
    }
}