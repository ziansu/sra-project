public java.util.Set<edu.cmu.tetrad.sem.Node> getReferencingNodes(edu.cmu.tetrad.sem.Node node) {
    java.util.Set<edu.cmu.tetrad.sem.Node> set = referencedNodes.get(node);
    return set == null ? new java.util.HashSet<edu.cmu.tetrad.sem.Node>() : new java.util.HashSet(set);
}