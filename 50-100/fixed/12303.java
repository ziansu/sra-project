protected final int getLineStart(java.lang.String line) {
    int index = 0;
    while ((index < (line.length())) && (java.lang.Character.isWhitespace(line.charAt(index)))) {
        index++;
    } 
    return com.puppycrawl.tools.checkstyle.utils.CommonUtils.lengthExpandedTabs(line, index, indentCheck.getIndentationTabWidth());
}