private void writeDoWhile(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.DoWhile> b) {
    out.println("do {");
    writeBlock((indent + 1), b.getBlock(0));
    tabIndent((indent + 1));
    out.print("} while(");
    writeExpression(b.getOperand(0));
    out.println(");");
}