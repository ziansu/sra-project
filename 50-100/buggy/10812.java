public static int next(int digit, int size) {
    int nextVal;
    while (odometer.Odometer.isValid(digit)) {
        nextVal = digit++;
        if (((digit % 10) ^ (size + 1)) == 1) {
            nextVal = 1;
        }
    } 
    return nextVal;
}