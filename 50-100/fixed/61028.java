private void writeArrayGenerator(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr) {
    out.print("wyjs.array(");
    writeExpression(expr.getOperand(0));
    out.print(", ");
    writeExpression(expr.getOperand(1));
    out.print(")");
}