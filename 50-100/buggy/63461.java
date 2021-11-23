TokenKind getToken() {
    if (((index) == ((currentLine.length()) - 1)) || ((Tok) == (java.lang.Character.MIN_VALUE))) {
        return TokenKind.EOF;
    }
    TokenKind getTok = TokenKind.ERROR;
    Tok = currentLine.charAt(index);
    if (java.lang.Character.isLowerCase(Tok)) {
        getTok = TokenKind.LOWER_CASE_WORD;
    }
    return getTok;
}