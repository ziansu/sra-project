@java.lang.Override
public java.lang.Void visit(ql.ast.statement.Question questionNode) {
    ql.ast.expression.Identifier questionIdentifier = questionNode.getIdentifier();
    if ((scopedEnvironment.resolve(questionIdentifier)) == null) {
        scopedEnvironment.store(questionIdentifier, questionNode.getType());
        typeEnvironment.store(questionIdentifier, questionNode.getType());
    }else {
        errorEnvironment.addError(new ql.errorhandling.error.RedefinedVariableError(questionIdentifier));
    }
    return null;
}