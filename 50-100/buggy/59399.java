@java.lang.Override
public com.github.kubatatami.richedittext.styles.multi.SizeSpanController.RichAbsoluteSizeSpan add(java.lang.Float value, android.text.Editable editable, int selectionStart, int selectionEnd, int flags) {
    com.github.kubatatami.richedittext.styles.multi.SizeSpanController.RichAbsoluteSizeSpan result = new com.github.kubatatami.richedittext.styles.multi.SizeSpanController.RichAbsoluteSizeSpan(((int) (com.github.kubatatami.richedittext.other.DimenUtil.convertDpToPixel(value))));
    editable.setSpan(result, selectionStart, selectionEnd, flags);
    return result;
}