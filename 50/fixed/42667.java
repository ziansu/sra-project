public com.oracle.truffle.sl.nodes.SLStatementNode createBreak(com.oracle.truffle.sl.parser.Token breakToken) {
    final com.oracle.truffle.sl.nodes.controlflow.SLBreakNode breakNode = new com.oracle.truffle.sl.nodes.controlflow.SLBreakNode(srcFromToken(breakToken));
    return breakNode;
}