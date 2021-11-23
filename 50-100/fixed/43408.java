private ConcreteTree.IRepDecl repDecl() throws parser.GrammarErrorException {
    if ((terminal) == (Terminals.SEMICOLON)) {
        java.lang.System.out.println("repDecl ::= SEMICOLON decl repDecl");
        consume(Terminals.SEMICOLON);
        parser.ConcreteTree.Decl decl = decl();
        parser.ConcreteTree.IRepDecl repDecl = repDecl();
        return new parser.ConcreteTree.RepDeclConcat(new parser.SemicolonToken(), decl, repDecl);
    }else {
        java.lang.System.out.println("repDecl ::= epsilon");
        return new parser.ConcreteTree.RepDeclEpsilon();
    }
}