@java.lang.Override
public void visit(regalloc.VMemWrite vMemWrite) {
    regalloc.VMemRef.Global ref = ((regalloc.VMemRef.Global) (vMemWrite.dest));
    use.add(ref.base.toString());
    if (vMemWrite.source instanceof regalloc.VVarRef) {
        use.add(vMemWrite.source.toString());
    }
}