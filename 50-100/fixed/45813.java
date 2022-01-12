private parser.BaseToken consume(parser.Terminals expectedTerminals) throws parser.GrammarErrorException {
    if ((terminal) == expectedTerminals) {
        parser.BaseToken consumedToken = token;
        if ((terminal) != (Terminals.SENTINEL)) {
            token = tokenList.nextToken();
            terminal = token.getTerminal();
        }
        return consumedToken;
    }else {
        throw new parser.GrammarErrorException(((("terminal expected: " + expectedTerminals) + ", terminal found: ") + (terminal)));
    }
}