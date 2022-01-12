private static void primeFactorization(long num) {
    int i = 2;
    long temp = num;
    do {
        if (((temp % i) == 0) && (nz.ac.vuw.ecs.problems.Problem3.checkPrime(i))) {
            nz.ac.vuw.ecs.problems.Problem3.list.add(i);
            temp = temp / i;
        }
        i++;
    } while (i <= temp );
}