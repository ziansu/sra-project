@java.lang.Override
public java.lang.StringBuilder generateJavaInit(final org.eclipse.titan.designer.compiler.JavaGenData aData, java.lang.StringBuilder source, java.lang.String name) {
    org.eclipse.titan.designer.AST.TTCN3.values.expressions.ExpressionStruct expression = new org.eclipse.titan.designer.AST.TTCN3.values.expressions.ExpressionStruct();
    expression.expression.append(name);
    expression.expression.append(" = ");
    generateCodeExpressionExpression(aData, expression);
    expression.mergeExpression(source, false);
    return source;
}