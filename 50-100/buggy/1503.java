private boolean isMatchFolder(java.lang.String folderPath) {
    final boolean result;
    if ((folderPattern) == null) {
        result = true;
    }else {
        final boolean useMatch;
        if ((fileNamePattern) == null) {
            useMatch = match;
        }else {
            useMatch = true;
        }
        result = (folderPattern.matcher(folderPath).find()) == useMatch;
    }
    return result;
}