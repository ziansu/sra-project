protected int indexOfValidChar(com.github.rtoshiro.util.format.pattern.MaskPattern patternMaskChar, java.lang.String text, int offset) {
    for (int i = offset; i < (text.length()); i++) {
        char c = text.charAt(i);
        if (patternMaskChar.isValid(c))
            return i;
        
    }
    return -1;
}