private void writeVariableCopy(wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableAccess> loc, java.io.PrintWriter out) {
    wyil.lang.SyntaxTree.Location<wyil.lang.Bytecode.VariableDeclaration> vd = getVariableDeclaration(loc.getOperand(0));
    if (wyjs.io.JavaScriptFileWriter.isCopyable(vd.getType())) {
        out.print(vd.getBytecode().getName());
    }else {
        out.print((("wyjs.copy(" + (vd.getBytecode().getName())) + ")"));
    }
}