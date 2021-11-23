public void visit(ir.cfgraph.LinearCodePoint codePoint) {
    visited.add(codePoint);
    handleCodepoint(codePoint.getParents());
}