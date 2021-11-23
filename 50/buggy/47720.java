private void writeDereference(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr, java.io.PrintWriter out) {
    writeExpression(expr.getOperand(0), out);
    out.print(".box");
}