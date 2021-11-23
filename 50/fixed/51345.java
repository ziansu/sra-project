private void writeNewObject(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr) {
    out.print("{box: ");
    writeExpression(expr.getOperand(0));
    out.print("}");
}