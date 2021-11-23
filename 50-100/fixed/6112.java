protected boolean startNewBlockAnalysis(final org.sosy_lab.cpachecker.cpa.arg.ARGState pState, final org.sosy_lab.cpachecker.cfa.model.CFANode node, final org.sosy_lab.cpachecker.cpa.bam.BAMPrecision prec) {
    boolean result = (partitioning.isCallNode(node)) && (!(partitioning.getBlockForCallNode(node).equals((stack.isEmpty() ? null : stack.peek().getThird()))));
    if (result) {
        if (data.shouldBeSkipped(node)) {
            return false;
        }
    }
    return result;
}