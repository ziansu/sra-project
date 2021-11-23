private int getAgentEncoding(com.sun.org.apache.xalan.internal.xsltc.runtime.Node node, int timeStep, int binaryIndex) {
    return ((((vertexOffset) + (edgeOffset)) + (((makespan) * (node.getIndexInGraph())) * (numBinaryPropVars))) + (timeStep * (numBinaryPropVars))) + binaryIndex;
}