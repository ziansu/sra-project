@java.lang.Override
public java.lang.Void visit(ql.ast.statement.Question questionNode) {
    ql.ast.expression.Identifier questionIdentifier = questionNode.getIdentifier();
    if ((typeEnvironment.resolve(questionIdentifier)) == null) {
        typeEnvironment.store(questionIdentifier, questionNode.getType());
        scopedEnvironment.store(questionIdentifier, questionNode.getType());
    }else {
        errorEnvironment.addError(new ql.errorhandling.error.RedefinedVariableError(questionIdentifier));
    }
    return null;
}