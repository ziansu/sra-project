private boolean isPrime(long number) {
    if ((number < 2) || ((number % 2) == 0)) {
        return false;
    }
    if (number == 2) {
        return true;
    }
    for (long oddNumber = 3; oddNumber <= (java.lang.Math.sqrt(number)); oddNumber += 2) {
        if ((number % oddNumber) == 0) {
            return false;
        }
    }
    return true;
}