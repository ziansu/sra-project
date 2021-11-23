protected boolean consumeUnicodeEscapeSequence(melnorme.lang.tooling.parser.lexer.ICharacterReader reader) {
    if (consume(reader, 'u')) {
        while (true) {
            int la = reader.lookahead();
            if (!(((la == '{') || (la == '}')) || (isHexDigit(la)))) {
                break;
            }
            reader.read();
        } 
        return true;
    }
    return false;
}