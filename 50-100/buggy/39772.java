public java.lang.String extractFileSubstring(java.lang.String[] strArr, int startIndex) throws java.net.URISyntaxException {
    java.lang.String filename = strArr[startIndex];
    for (int i = startIndex + 1; i < (strArr.length); i++) {
        if (new java.io.File(new java.net.URI(filename)).exists()) {
            filename = (filename + (cc.mallet.topics.gui.TopicModelingTool.CSV_DEL)) + i;
            break;
        }
        filename = (filename + (cc.mallet.topics.gui.TopicModelingTool.CSV_DEL)) + (strArr[i]);
    }
    return filename;
}