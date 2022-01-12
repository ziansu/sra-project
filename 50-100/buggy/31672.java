private void addCast(com.google.devtools.j2objc.ast.Expression expr) {
    org.eclipse.jdt.core.dom.ITypeBinding exprType = typeEnv.mapType(expr.getTypeBinding().getTypeDeclaration());
    com.google.devtools.j2objc.ast.CastExpression castExpr = new com.google.devtools.j2objc.ast.CastExpression(exprType, null);
    expr.replaceWith(com.google.devtools.j2objc.ast.ParenthesizedExpression.parenthesize(castExpr));
    castExpr.setExpression(expr);
}