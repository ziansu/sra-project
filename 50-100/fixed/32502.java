static int sequential(int[] A, int K) {
    for (int i = 0; i < (A.length); i++)
        if ((A[i]) == K)
            return i;
        
    
    return A.length;
}