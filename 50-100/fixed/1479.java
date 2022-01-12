public static int normalizeOffset(final com.maddyhome.idea.vim.helper.Editor editor, int offset, final boolean allowEnd) {
    if (offset <= 0) {
        return 0;
    }
    final int textLength = editor.getDocument().getTextLength();
    if (offset > textLength) {
        if (allowEnd) {
            return textLength;
        }else {
            return textLength - 1;
        }
    }
    return offset;
}