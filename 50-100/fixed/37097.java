protected void adjustOffset(java.lang.String oldChunk) {
    java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\r\n|\n|\r").matcher(oldChunk);
    int lastMatchEnd = -1;
    while (matcher.find()) {
        (lineOffset)++;
        lastMatchEnd = (matcher.end()) - 1;
    } 
    columnOffset = (oldChunk.length()) - lastMatchEnd;
}