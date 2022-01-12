private void setObservedFaultNode(microbat.model.trace.Trace buggyTrace) {
    java.util.Map<java.lang.Integer, microbat.model.trace.TraceNode> allWrongNodeMap = findAllWrongNodes(getPairList(), buggyTrace);
    if (!(allWrongNodeMap.isEmpty())) {
        java.util.List<microbat.model.trace.TraceNode> wrongNodeList = new java.util.ArrayList(allWrongNodeMap.values());
        java.util.Collections.sort(wrongNodeList, new microbat.model.trace.TraceNodeReverseOrderComparator());
        observedFaultNode = wrongNodeList.get(0);
    }
}