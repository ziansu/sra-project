private static org.checkerframework.dataflow.analysis.FlowExpressions.Receiver parse(java.lang.String s, org.checkerframework.framework.util.FlowExpressionParseUtil.FlowExpressionContext context, com.sun.source.util.TreePath path, boolean recursiveCall) throws org.checkerframework.framework.util.FlowExpressionParseUtil.FlowExpressionParseException {
    org.checkerframework.dataflow.analysis.FlowExpressions.Receiver result = org.checkerframework.framework.util.FlowExpressionParseUtil.parse(s, context, path, true, true, true, true, true, true, true, true, recursiveCall, false);
    assert result != null;
    return result;
}