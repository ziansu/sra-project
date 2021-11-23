public java.lang.String toCssString(final boolean rebuild) {
    initCssFile();
    modified = rebuild;
    return cssBlocks.toString();
}