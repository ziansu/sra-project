public edu.cmu.tetrad.sem.Node getErrorNode(edu.cmu.tetrad.sem.Node node) {
    if (errorNodes.contains(node)) {
        return node;
    }
    int index = variableNodes.indexOf(node);
    if (index == (-1)) {
        throw new java.lang.NullPointerException(((node + " is not a node in this model. Perhaps ") + "it's another node with the same name."));
    }
    return errorNodes.get(index);
}