protected int getParagraphEndOffset(int caretOffset) {
    int offset = caretOffset;
    int length = _docText.length();
    while (offset < (length - 1)) {
        if (((charAt(offset)) == '\n') && (offsetIsAtEmptyLine((offset + 1)))) {
            offset++;
            break;
        }
        offset++;
    } 
    return offset;
}