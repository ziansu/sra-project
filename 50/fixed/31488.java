public void visit(compiler.phase.seman.VarName varName) {
    if ((iteration) > 0) {
        compiler.phase.seman.Decl decl = attrs.declAttr.get(varName);
        attrs.typAttr.set(varName, attrs.typAttr.get(decl));
    }
}