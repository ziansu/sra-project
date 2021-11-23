private void writeArrayInitialiser(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr, java.io.PrintWriter out) {
    wyil.lang.SyntaxTree.Location<?>[] operands = expr.getOperands();
    out.print("[");
    for (int i = 0; i != (operands.length); ++i) {
        if (i != 0) {
            out.print(", ");
        }
        writeExpression(operands[i], out);
    }
    out.print("]");
}