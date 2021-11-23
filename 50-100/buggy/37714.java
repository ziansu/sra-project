private ConcreteTree.IOptGLOBALCpsDecl optGLOBALCpsDecl() throws parser.GrammarErrorException {
    parser.ConcreteTree.IOptGLOBALCpsDecl ret = null;
    if ((terminal) == (Terminals.GLOBAL)) {
        java.lang.System.out.println("optGLOBALcpsDecl ::= GLOBAL cpsDecl ");
        parser.ConcreteTree.CpsDecl cpsdecl = cpsDecl();
        ret = new parser.ConcreteTree.OptGLOBALCpsDeclConcat(((parser.GlobalToken) (consume(Terminals.GLOBAL))), cpsdecl);
    }else
        if ((terminal) == (Terminals.DO)) {
            java.lang.System.out.println("optGLOBALcpsDecl ::= epsilon");
            ret = new parser.ConcreteTree.OptGLOBALCpsDeclEpsilon();
        }
    
    return ret;
}