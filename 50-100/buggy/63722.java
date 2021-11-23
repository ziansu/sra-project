private void parseClassName() {
    this.curMatcher = Parser.DOT_PATTERN.matcher(this.function);
    if (this.curMatcher.find()) {
        this.curClass = this.function.substring(0, ((this.curMatcher.end()) - 1));
    }
}