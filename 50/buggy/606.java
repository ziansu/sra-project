private void writeVariableMove(wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableAccess> loc, java.io.PrintWriter out) {
    wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableDeclaration> vd = getVariableDeclaration(loc.getOperand(0));
    out.print(vd.getBytecode().getName());
}