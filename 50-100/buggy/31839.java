private int getClosingComment(int offset) {
    while (((offset < ((bufferEndOffset) - 1)) && ((charAt(offset)) != '*')) && ((charAt((offset + 1))) != '/'))
        offset++;
    
    return offset + 2;
}