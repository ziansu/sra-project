@java.lang.Override
protected void beforeParent(ir.cfgraph.CodePoint codePoint) {
    previousLivenessFlags = livenessMap.get(codePoint);
}