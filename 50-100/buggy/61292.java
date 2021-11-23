public void printAdjList() {
    if (((adjList) == null) || ((adjList.size()) == 0)) {
        java.lang.System.out.println("The adjacency list is not set yet.");
    }else {
        java.lang.System.out.println("Start printing adjacency list:");
        for (graph.undirectedGraph.UGNode n : adjList.values())
            n.print();
        
    }
}