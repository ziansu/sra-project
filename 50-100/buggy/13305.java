public static void initCenters(double[][] ctr) {
    java.util.Random rand = new java.util.Random(0);
    for (int k = 0; k < (KMeans.K); k++) {
        int r = rand.nextInt(KMeans.N);
        for (int m = 0; m < (KMeans.M); m++)
            ctr[k][m] = KMeans.data[r][m];
        
    }
    return ;
}