private void writeBracketedExpression(wyil.lang.SyntaxTree.Location<?> expr) {
    boolean needsBrackets = needsBrackets(expr.getBytecode());
    if (needsBrackets) {
        out.print("(");
    }
    writeExpression(expr);
    if (needsBrackets) {
        out.print(")");
    }
}