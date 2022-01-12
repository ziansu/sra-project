public int solution(int[] A) {
    int min = java.lang.Integer.MAX_VALUE;
    for (int i = 0; i < (A.length); i++) {
        if ((A[i]) < min)
            min = A[i];
        
        int tmp = A[i];
        int tmp2 = A[tmp];
        A[tmp] = tmp;
        A[i] = tmp2;
    }
    return -1;
}