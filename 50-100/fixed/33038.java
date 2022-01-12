public static Hyperedge createRandomEdge(java.util.Random gen, int numNodes) {
    Hyperedge newEdge = new Hyperedge(new Annotation(), gen.nextInt(numNodes), Utilities.genSubset(gen, 3, 0, numNodes));
    boolean success = true;
    for (int source : newEdge.sourceNodes) {
        if ((newEdge.targetNode) == source) {
            success = false;
            break;
        }
    }
    if (!success)
        newEdge = Utilities.createRandomEdge(gen, numNodes);
    
    return newEdge;
}