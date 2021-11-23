public long[] countInstancesOfNodeDegrees(int maxDegrees) {
    long[] res = new long[maxDegrees];
    for (int n = 0; n < (getNumberOfNodes()); n++) {
        int deg = getNodeDegree(n);
        if (deg < maxDegrees) {
            java.lang.System.out.print((deg + " "));
            java.lang.System.out.println(res[deg]);
            (res[deg])++;
        }
    }
    return res;
}