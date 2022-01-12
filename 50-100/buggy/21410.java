public java.lang.String generate(tupleGeneration.StatementTail AST) {
    output.accept(((AST.getLine()) + ": generating code for StatementTail\n"));
    if (AST instanceof tupleGeneration.AssignStatementTail)
        return generate(((tupleGeneration.AssignStatementTail) (AST)));
    else
        if (AST instanceof tupleGeneration.CallStatementTail)
            return generate(((tupleGeneration.CallStatementTail) (AST)));
        
    
    throw new util.WTFException("Malformed statement tail found in quadruple generation stage");
}