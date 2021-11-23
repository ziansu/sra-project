@java.lang.Override
protected java.lang.Void visit(com.oracle.truffle.r.runtime.nodes.RSyntaxCall element) {
    if (element instanceof com.oracle.truffle.r.nodes.control.AbstractLoopNode) {
        instrumenter.attachListener(loopBuilder.build(), fser.getLoopStatementReceiver(((com.oracle.truffle.r.nodes.control.AbstractLoopNode) (element))));
    }
    accept(element.getSyntaxLHS());
    for (com.oracle.truffle.r.runtime.nodes.RSyntaxElement arg : element.getSyntaxArguments()) {
        accept(arg);
    }
    return null;
}