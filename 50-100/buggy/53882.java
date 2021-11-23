@java.lang.Override
public void visit(regalloc.VMemWrite vMemWrite) {
    regalloc.VMemRef.Global ref = ((regalloc.VMemRef.Global) (vMemWrite.dest));
    def.add(ref.base.toString());
    if (vMemWrite.source instanceof regalloc.VVarRef) {
        use.add(vMemWrite.source.toString());
    }
}