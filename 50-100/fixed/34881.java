@java.lang.Override
public java.lang.Void visit(ql.ast.statement.Form formNode) {
    ql.ast.expression.Identifier formIdentifier = formNode.getIdentifier();
    if ((scopedEnvironment.resolve(formIdentifier)) == null) {
        scopedEnvironment.store(formNode.getIdentifier(), new ql.ast.type.QLForm());
        typeEnvironment.store(formNode.getIdentifier(), new ql.ast.type.QLForm());
    }else {
        errorEnvironment.addError(new ql.errorhandling.error.RedefinedVariableError(formIdentifier));
    }
    return super.visit(formNode);
}