public void cluster() {
    int iter = 0;
    do {
        assignToCluster();
        reinitializeCluster();
        if (!(center.equals(centerOld))) {
            for (int i = 0; i < (clusterGroup.length); i++) {
                clusterGroup[i].removeAll(clusterGroup[i]);
            }
        }
        iter++;
    } while ((!(center.equals(centerOld))) && (iter < (maxIter)) );
}