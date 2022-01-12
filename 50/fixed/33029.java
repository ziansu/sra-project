@java.lang.Override
public java.lang.String finish(java.io.File method) throws ccl.v2_1.err.DebugException, ccl.v2_1.err.ImplementationException, java.io.IOException {
    return "putM " + (ccl.csy.CCL.compile(head, method.getPath()).getName());
}