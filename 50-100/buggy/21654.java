public void createAdjList(int[][] data, int[] weight) {
    adjList = new java.util.ArrayList<graph.undirectedGraph.UGNode>();
    if (((data == null) || (weight == null)) || ((data.length) != (weight.length)))
        return ;
    
    createAdjList(data);
    for (int i = 0; i < (weight.length); i++)
        adjList.get(i).weight = weight[i];
    
}