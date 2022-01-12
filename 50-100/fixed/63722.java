private void parseClassName(java.lang.String className) {
    this.curMatcher = Parser.DOT_PATTERN.matcher(className);
    if (this.curMatcher.find()) {
        this.className = className.substring(0, this.curMatcher.end());
    }
}