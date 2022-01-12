public java.lang.String toCssString(final boolean rebuild) {
    initCssFile();
    modified = rebuild;
    this.rebuild = rebuild;
    return cssBlocks.toString();
}