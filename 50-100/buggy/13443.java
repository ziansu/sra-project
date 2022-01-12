private static int getLongestLineLen(final java.lang.String message) {
    java.lang.String newLine = java.lang.System.getProperty("line.separator");
    java.lang.String[] lines = message.split(newLine);
    int maxLen = 0;
    for (java.lang.String line : lines) {
        maxLen = java.lang.Math.max(maxLen, lines[0].length());
    }
    return maxLen;
}