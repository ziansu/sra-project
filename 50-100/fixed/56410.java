private static double pairwiseSimilaritySum(double[][] l1Norm, int[] subset) {
    double res = 0;
    for (int i = 0; i < (subset.length); i++)
        for (int j = i; j < (subset.length); j++)
            res += l1Norm[subset[i]][subset[j]];
        
    
    return res;
}