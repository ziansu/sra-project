private parser.BaseToken consume(parser.Terminals expectedTerminals) throws parser.GrammarErrorException {
    java.lang.System.out.println("asdfasdfa");
    if ((terminal) == expectedTerminals) {
        java.lang.System.out.println("inside if");
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