protected boolean consumeUnicodeEscapeSequence(melnorme.lang.tooling.parser.lexer.ICharacterReader reader) {
    if (consume(reader, 'u')) {
        int la = reader.lookahead();
        while (((la == '{') || (la == '}')) || (isHexDigit(la))) {
            reader.read();
        } 
        return true;
    }
    return false;
}