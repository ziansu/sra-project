public char decodeBoundCheckCapitalLetters(char c) {
    int check = c - (keyShift);
    if (check < (Cipher.MIN_CAPITAL_ASCII)) {
        c -= keyShift;
        c = ((char) ((Cipher.MIN_CAPITAL_ASCII) - c));
        c = ((char) ((Cipher.MAX_CAPITAL_ASCII) - c));
        return c;
    }
    return c -= keyShift;
}