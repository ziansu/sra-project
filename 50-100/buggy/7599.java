public void visit(compiler.phase.seman.FunCall funCall) {
    for (int a = 0; a < (funCall.numArgs()); a++)
        funCall.arg(a).accept(this);
    
    compiler.phase.seman.Decl decl = attrs.declAttr.get(funCall);
    compiler.phase.seman.Typ typ = attrs.typAttr.get(decl);
    if (typ != null)
        attrs.typAttr.set(funCall, ((compiler.phase.seman.FunTyp) (typ)).resultTyp);
    
}