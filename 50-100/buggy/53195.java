private void writeDoWhile(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.DoWhile> b, java.io.PrintWriter out) {
    out.println("do {");
    writeBlock((indent + 1), b.getBlock(0), out);
    wyjs.io.JavaScriptFileWriter.tabIndent((indent + 1), out);
    out.print("} while(");
    writeExpression(b.getOperand(0), out);
    out.println(");");
}