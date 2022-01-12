private void writeInfixLocations(wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Operator> c) {
    writeBracketedExpression(c.getOperand(0));
    out.print(" ");
    out.print(wyjs.io.JavaScriptFileWriter.opcode(c.getBytecode().kind()));
    out.print(" ");
    writeBracketedExpression(c.getOperand(1));
}