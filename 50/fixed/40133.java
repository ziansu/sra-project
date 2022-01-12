private void calculateClosestClustersToData() {
    for (SingleInstance s : initialDataset) {
        findClosetCluster(s);
        java.lang.System.out.println(s.getClusterClass());
    }
}