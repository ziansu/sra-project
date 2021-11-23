private se.l4.commons.serialization.format.Token toToken(char c) {
    switch (c) {
        case '{' :
            return Token.OBJECT_START;
        case '}' :
            return Token.OBJECT_END;
        case '[' :
            return Token.LIST_START;
        case ']' :
            return Token.LIST_END;
        case '"' :
            if ((((current()) != null) && ((current()) != (Token.KEY))) && (!(lists[level]))) {
                return Token.KEY;
            }
    }
    if (c == 'n') {
        return Token.NULL;
    }
    return Token.VALUE;
}