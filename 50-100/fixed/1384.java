private void parseMainContent(int startIndex, java.lang.String raw) throws ccl.v2_1.err.ImplementationException {
    this.before = raw.substring(0, startIndex).trim();
    this.content = raw.substring(startIndex);
    this.content = content.substring(1, ((content.length()) - 1)).trim();
}