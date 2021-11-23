private void writeNewObject(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr, java.io.PrintWriter out) {
    out.print("{box: ");
    writeExpression(expr.getOperand(0), out);
    out.print("}");
}