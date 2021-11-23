@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
public void haltedAt(com.oracle.truffle.api.nodes.Node astNode, com.oracle.truffle.api.frame.MaterializedFrame mFrame, java.lang.String haltReason) {
    if ((debugContext) != null) {
        debugContext.halt(astNode, mFrame, true, haltReason);
    }
}