public static int next(int digit, int size) {
    int nextVal = 0;
    while (odometer.Odometer.isValid(digit, size)) {
        nextVal = digit++;
        if (((digit % 10) ^ (size + 1)) == 1) {
            nextVal = 1;
        }
    } 
    return nextVal;
}