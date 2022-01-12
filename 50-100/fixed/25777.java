private void writeVariableDeclaration(int indent, wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableDeclaration> loc) {
    wyil.lang.SyntaxTree.Location<?>[] operands = loc.getOperands();
    out.print("var ");
    writeType(loc.getType());
    out.print(loc.getBytecode().getName());
    if ((operands.length) > 0) {
        out.print(" = ");
        writeExpression(operands[0]);
    }
    out.println(";");
}