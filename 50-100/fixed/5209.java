@org.jetbrains.annotations.NotNull
private java.util.Map<org.apache.ignite.cluster.ClusterNode, int[]> createBalanceMap(java.util.List<org.apache.ignite.cluster.ClusterNode> nodes, int replicasCnt) {
    java.util.Map<org.apache.ignite.cluster.ClusterNode, int[]> balanceMap = new java.util.HashMap<>();
    for (org.apache.ignite.cluster.ClusterNode n : nodes) {
        int[] arr = new int[replicasCnt];
        java.util.Arrays.fill(arr, (((parts) / (nodes.size())) + 1));
        balanceMap.put(n, arr);
    }
    return balanceMap;
}