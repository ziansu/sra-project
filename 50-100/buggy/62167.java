public java.lang.String getFilePath() {
    java.lang.String filePath = "";
    try {
        if (!(fileExists()))
            filePath = makeFile();
        else
            filePath = (tempFilePath) + (finalName);
        
    } catch (java.io.IOException e) {
        logger.severe(e.getMessage());
    }
    return filePath;
}