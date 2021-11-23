private long findLastXRef() throws java.io.IOException {
    source.seekFromEnd(64);
    if (findKeyword(Token.Keyword.KW_STARTXREF)) {
        nextToken();
        if ((getToken().type) == (Token.Type.TT_INTEGER)) {
            return getToken().integer;
        }
    }
    return 0;
}