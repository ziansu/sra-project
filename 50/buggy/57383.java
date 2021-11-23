private static boolean isIntegerSqrt(int k) {
    int i = 1;
    while ((i * i) < k)
        i++;
    
    return (i * i) == k;
}