private void writeWhile(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.While> b, java.io.PrintWriter out) {
    out.print("while(");
    writeExpression(b.getOperand(0), out);
    out.println(") {");
    writeBlock((indent + 1), b.getBlock(0), out);
    wyjs.io.JavaScriptFileWriter.tabIndent((indent + 1), out);
    out.println("}");
}