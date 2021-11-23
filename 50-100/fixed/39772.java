public java.lang.String extractFileSubstring(java.lang.String[] strArr, int startIndex) throws java.net.URISyntaxException {
    java.lang.String filename = strArr[startIndex];
    java.lang.System.out.println(filename);
    for (int i = startIndex + 1; i < (strArr.length); i++) {
        filename = (filename + (cc.mallet.topics.gui.TopicModelingTool.CSV_DEL)) + (strArr[i]);
    }
    return filename;
}