@java.lang.Override
public int clusterID(int tuple) {
    double minHere = java.lang.Integer.MAX_VALUE;
    int ID = -1;
    for (int i = 0; i < (numClusters); i++) {
        if ((cost[tuple][i]) < minHere) {
            ID = i;
        }
    }
    return ID + 1;
}