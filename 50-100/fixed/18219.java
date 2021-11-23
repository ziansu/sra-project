private void writeWhile(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.While> b) {
    out.print("while(");
    writeExpression(b.getOperand(0));
    out.println(") {");
    writeBlock((indent + 1), b.getBlock(0));
    tabIndent((indent + 1));
    out.println("}");
}