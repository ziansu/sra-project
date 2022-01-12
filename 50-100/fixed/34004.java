public static int getNumberOfValidators(long number) {
    long oneDay = (3 * 60) * 24;
    if (number < (90 * oneDay)) {
        return ((int) (10 + (number / oneDay)));
    }else {
        return 100;
    }
}