private void writeVariableCopy(wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableAccess> loc, java.io.PrintWriter out) {
    wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableDeclaration> vd = getVariableDeclaration(loc.getOperand(0));
    if (isCopyable(vd.getType(), loc)) {
        out.print(vd.getBytecode().getName());
    }else {
        out.print((("wyjs.copy(" + (vd.getBytecode().getName())) + ")"));
    }
}