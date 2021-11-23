private ConcreteTree.ITypeIdent typeIdent() throws parser.GrammarErrorException {
    java.lang.System.out.println("typedIdent ::= IDENT COLON TYPE");
    parser.ConcreteTree.TypeIdent ret = null;
    parser.IdentToken ident = ((parser.IdentToken) (consume(Terminals.IDENT)));
    parser.ColonToken colon = ((parser.ColonToken) (consume(Terminals.COLON)));
    parser.TypeToken type = ((parser.TypeToken) (consume(Terminals.TYPE)));
    ret = new parser.ConcreteTree.TypeIdent(ident, colon, type);
    return ret;
}