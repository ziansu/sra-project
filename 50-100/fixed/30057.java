public static int next(int digit, int size) {
    int nextVal = digit + 1;
    while (!(odometer.Odometer.isValid(nextVal, size))) {
        if (nextVal >= (java.lang.Math.pow(10, size))) {
            nextVal = 1;
        }
        nextVal++;
    } 
    return nextVal;
}