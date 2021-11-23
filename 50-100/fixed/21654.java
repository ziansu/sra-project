public void createAdjList(int[][] data, int[] weight) {
    if (((data == null) || (weight == null)) || ((data.length) != (weight.length)))
        return ;
    
    adjList = new java.util.HashMap<java.lang.Integer, graph.undirectedGraph.UGNode>();
    createAdjList(data);
    for (int i = 0; i < (weight.length); i++)
        adjList.get(i).weight = weight[i];
    
}