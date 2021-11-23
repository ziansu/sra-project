private boolean isPrime(int number) {
    if (number == 2) {
        return true;
    }
    if ((number < 2) || ((number % 2) == 0)) {
        return false;
    }
    for (int oddNumber = 3; oddNumber <= (java.lang.Math.sqrt(number)); oddNumber += 2) {
        if ((number % oddNumber) == 0) {
            return false;
        }
    }
    return true;
}