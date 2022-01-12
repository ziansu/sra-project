private void generate(int k) {
    int i = 0;
    long maxSum = k;
    long maxMul = 1;
    while ((++maxSum) > (maxMul <<= 1)) {
        i++;
    } 
    while (!(redistribute(i, i, k, 1))) {
        i++;
    } 
}