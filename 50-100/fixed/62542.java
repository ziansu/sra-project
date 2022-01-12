public edu.cmu.tetrad.sem.Node getErrorNode(edu.cmu.tetrad.sem.Node node) {
    if (errorNodes.contains(node)) {
        return node;
    }
    int index = variableNodes.indexOf(node);
    if (index == (-1)) {
        return null;
    }
    return errorNodes.get(index);
}