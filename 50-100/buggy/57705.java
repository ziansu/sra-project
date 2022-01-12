public static long summationOfPrimes(int max) {
    boolean[] list = projectEuler.ProjectHelper.sieveOfErathosthenes(max);
    long sum = 0;
    for (int i = 2; i < (list.length); i++) {
        if (!(list[i])) {
            sum += i;
        }
    }
    return sum;
}