private void generate(int k) {
    int i = 0;
    int maxSum;
    int maxMul;
    do {
        maxSum = k;
        maxMul = 1;
        do {
            i++;
            maxSum++;
            maxMul = ((int) (java.lang.Math.pow(2, i)));
        } while (maxSum > maxMul );
    } while (!(redistribute(k, i, i, k, 1, k)) );
}