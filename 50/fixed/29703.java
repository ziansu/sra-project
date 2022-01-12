public static boolean isIntegerSqrt(long k) {
    long i = 1;
    while ((i * i) < k)
        i++;
    
    return (i * i) == k;
}