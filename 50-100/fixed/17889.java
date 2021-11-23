public long[] countInstancesOfNodeDegrees(int maxDegrees) {
    long[] res = new long[maxDegrees];
    for (int n = 0; n < (getNumberOfNodes()); n++) {
        int deg = getNodeDegree(n);
        if (deg < maxDegrees) {
            (res[deg])++;
        }
    }
    return res;
}