@java.lang.Override
public java.lang.Object visitArrayStatement(ArrayStatementContext ctx) {
    java.lang.Object arrayType = visit(ctx.expression(0));
    for (ExpressionContext expression : ctx.expression()) {
        java.lang.Object type = visit(expression);
        if (!(type.equals(arrayType))) {
            throw new java.lang.NumberFormatException("Elements in array are not all of same type");
        }
    }
    symbolTable.currentScope().define(ctx.IDENTIFIER().getText(), arrayType.toString());
    return null;
}