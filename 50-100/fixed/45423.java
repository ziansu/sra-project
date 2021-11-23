public int readBEWordFrom(int offset) {
    if ((mapContent) == null)
        return 0;
    
    return ((mapContent[offset]) & 255) | (((mapContent[(offset + 1)]) & 255) << 8);
}