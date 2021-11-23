private java.util.Set<java.util.List<java.lang.Integer>> estimateClustersSAG() {
    java.util.List<java.lang.Integer> _variables = allVariables();
    java.util.Set<java.util.List<java.lang.Integer>> pureClusters = findPureClusters(_variables);
    java.util.Set<java.util.List<java.lang.Integer>> mixedClusters = findMixedClusters(pureClusters, _variables, unionPure(pureClusters));
    java.util.Set<java.util.List<java.lang.Integer>> allClusters = new java.util.HashSet<>(pureClusters);
    allClusters.addAll(mixedClusters);
    return allClusters;
}