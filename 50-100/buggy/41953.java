public microbat.model.trace.TraceNode findCorrespondingStartNode(microbat.model.trace.TraceNode endNode2) {
    for (int i = 0; i < (skipPoints.size()); i++) {
        microbat.model.trace.TraceNode node = skipPoints.get(i);
        if ((node.getOrder()) == (endNode2.getOrder())) {
            if (i > 0) {
                microbat.model.trace.TraceNode startNode = skipPoints.get((i - 1));
                return startNode;
            }else {
                java.lang.System.err.println("In findCorrespondingStartNode(), the input endNode2 is the start of skipPoints");
            }
        }
    }
    return null;
}