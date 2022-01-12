public void generate(tupleGeneration.IdStatement AST) {
    output.accept(((AST.getLine()) + ": generating code for IdStatement\n"));
    java.lang.String assignedValue = generate(AST.getIdToken().name, AST.getId_stmt_tail());
    AST.appendCode(AST.getId_stmt_tail().getCode());
    if (assignedValue != null)
        AST.appendCode((((("(asg," + assignedValue) + ",-,") + (AST.getIdToken().name)) + ')'));
    
}