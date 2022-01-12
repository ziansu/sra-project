private void writeArrayGenerator(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr, java.io.PrintWriter out) {
    out.print("wyjs.array(");
    writeExpression(expr.getOperand(0), out);
    out.print(", ");
    writeExpression(expr.getOperand(1), out);
    out.print(")");
}