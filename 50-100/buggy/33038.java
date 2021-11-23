public static Hyperedge createRandomEdge(int numNodes) {
    java.util.Random gen = new java.util.Random();
    Hyperedge newEdge = new Hyperedge(new Annotation(), gen.nextInt(numNodes), Utilities.genSubset(3, 0, numNodes));
    boolean success = true;
    for (int source : newEdge.sourceNodes) {
        if ((newEdge.targetNode) == source) {
            success = false;
            break;
        }
    }
    if (!success)
        newEdge = Utilities.createRandomEdge(numNodes);
    
    return newEdge;
}