private java.lang.String deleteBlockComment(java.lang.String line, java.lang.String endCommentSymbol, java.lang.String startCommentSymbol) {
    int index = line.indexOf(startCommentSymbol);
    java.lang.String tempStr = line.substring(0, index);
    line = tempStr + (checkForEndBlock(line.substring((index + (startCommentSymbol.length()))), endCommentSymbol, startCommentSymbol));
    return line;
}