public java.lang.Object VisitBaseVariable(ASTBaseVariable base) {
    VariableEntry baseEntry = variableEnv.find(base.name());
    if (baseEntry == null) {
        CompError.message(base.line(), ((("Variable " + (base.name())) + " is not defined in this ") + "scope"));
        return new SemanticAnalyzer.TypeClass(IntegerType.instance(), null);
    }else {
        return new SemanticAnalyzer.TypeClass(var.type(), bt.baseVariable(var.offset()));
    }
}