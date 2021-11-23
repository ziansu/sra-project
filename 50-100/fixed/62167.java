public java.lang.String getFilePath() {
    java.lang.String filePath = "";
    try {
        if (!(fileExists()))
            filePath = makeFile();
        else
            new java.io.File(((tempFilePath) + (finalName))).delete();
        
        filePath = makeFile();
    } catch (java.io.IOException e) {
        logger.severe(e.getMessage());
    }
    return filePath;
}