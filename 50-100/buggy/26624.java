private static void printMST(int[] parent, int n, int[][] graph) {
    java.lang.System.out.println("Edge   Weight");
    for (int i = 1; i < (PrimMST.V); i++)
        java.lang.System.out.println((((((parent[i]) + " - ") + i) + "    ") + (graph[i][parent[i]])));
    
}