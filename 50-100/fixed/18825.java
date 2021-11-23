private ConcreteTree.IRepParam repParam() throws parser.GrammarErrorException {
    if ((terminal) == (Terminals.COMMA)) {
        java.lang.System.out.println("repParam ::= COMMA param repParam");
        consume(Terminals.COMMA);
        parser.ConcreteTree.Param param = param();
        parser.ConcreteTree.IRepParam repParam = repParam();
        return new parser.ConcreteTree.RepParamConcat(new parser.CommaToken(), param, repParam);
    }else {
        java.lang.System.out.println("repParam ::= epsilon");
        return new parser.ConcreteTree.RepParamEpsilon();
    }
}