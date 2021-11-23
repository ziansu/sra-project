private static double pairwiseSimilaritySum(double[][] l1Norm, int[] subset) {
    int res = 0;
    for (int i = 0; i < (subset.length); i++)
        for (int j = i; j < (subset.length); j++)
            res += l1Norm[i][j];
        
    
    return res;
}