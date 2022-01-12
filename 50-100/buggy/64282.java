private void writeBracketedExpression(wyil.lang.SyntaxTree.Location<?> expr, java.io.PrintWriter out) {
    boolean needsBrackets = needsBrackets(expr.getBytecode());
    if (needsBrackets) {
        out.print("(");
    }
    writeExpression(expr, out);
    if (needsBrackets) {
        out.print(")");
    }
}