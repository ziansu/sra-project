private void writeAliasDeclaration(int indent, wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.AliasDeclaration> loc) {
    out.print("alias ");
    out.print(loc.getType());
    out.print(" ");
    wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableDeclaration> aliased = getVariableDeclaration(loc);
    out.print(aliased.getBytecode().getName());
    out.println();
}