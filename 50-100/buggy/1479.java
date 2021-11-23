public static int normalizeOffset(final com.maddyhome.idea.vim.helper.Editor editor, int offset, final boolean allowEnd) {
    if (offset <= 0) {
        return 0;
    }
    final int textLength = editor.getDocument().getTextLength();
    if (offset > textLength) {
        offset = textLength;
    }
    if (((offset > 0) && (!allowEnd)) && ((editor.getDocument().getCharsSequence().charAt(offset)) == '\n')) {
        offset--;
    }
    return offset;
}