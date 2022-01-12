static int sumOfFactors(int num) {
    int sum = 1;
    for (int i = 2; i <= (java.lang.Math.sqrt(num)); i++) {
        if ((num % i) == 0) {
            sum = sum + i;
            sum = sum + (num / i);
        }
    }
    return sum;
}