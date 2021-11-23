private void writePrefixLocations(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> expr, java.io.PrintWriter out) {
    out.print(wyjs.io.JavaScriptFileWriter.opcode(expr.getBytecode().kind()));
    writeBracketedExpression(expr.getOperand(0), out);
}