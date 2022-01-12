private void writeNamedBlock(int indent, wyil.lang.SyntaxTree.Location<wyjs.io.Bytecode.NamedBlock> b, java.io.PrintWriter out) {
    out.print(b.getBytecode().getName());
    out.println(":");
    writeBlock((indent + 1), b.getBlock(0), out);
}