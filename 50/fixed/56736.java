public static int factorial(int n) {
    if ((n == 0) || (n == 1)) {
        return 1;
    }else {
        return n * (Aufgaben_Eisenbiegler.factorial_Rekursiv.factorial((n - 1)));
    }
}