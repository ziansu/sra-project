public static float harmonic() {
    float oldSum = 0.0F;
    float sum = 1.0F;
    int n = 1;
    while (oldSum < sum) {
        oldSum = sum;
        n += 1;
        sum += 1.0 / n;
        if ((n % 100000) == 0) {
            java.lang.System.out.println(((("n = " + n) + ", sum = ") + sum));
        }
    } 
    java.lang.System.out.println(((("n = " + n) + ", sum = ") + sum));
    return sum;
}