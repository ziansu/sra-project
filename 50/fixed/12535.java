private void writeAssert(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.Assert> c) {
    out.print("wyjs.assert(");
    writeExpression(c.getOperand(0));
    out.println(");");
}