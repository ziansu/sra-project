@java.lang.Override
protected com.github.kubatatami.richedittext.styles.multi.SizeSpanController.RichAbsoluteSizeSpan createSpan(java.lang.String styleValue) {
    float value = parseSize(styleValue);
    return new com.github.kubatatami.richedittext.styles.multi.SizeSpanController.RichAbsoluteSizeSpan(((int) (com.github.kubatatami.richedittext.other.DimenUtil.convertDpToPixel(value))), value);
}