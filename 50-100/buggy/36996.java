public static boolean primNumber(long number) {
    for (long i = 2; i < ((long) (java.lang.Math.sqrt(number))); i++) {
        if ((number % i) == 0) {
            return false;
        }
    }
    return true;
}