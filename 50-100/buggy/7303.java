public boolean clustersMatch(double[] cluster1, double[] cluster2, Emat emat) {
    for (int i = 0; i < (cluster1.length); i++) {
        if ((java.lang.Math.abs(((cluster1[i]) - (cluster2[i])))) > 2)
            return false;
        
    }
    return true;
}