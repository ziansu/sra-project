private void writeDereference(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr) {
    writeExpression(expr.getOperand(0));
    out.print(".box");
}