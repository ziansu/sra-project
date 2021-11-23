private int getVertexEncoding(com.sun.org.apache.xalan.internal.xsltc.runtime.Node node, int timeStep) {
    return ((node.getIndexInGraph()) * (makespan)) + timeStep;
}