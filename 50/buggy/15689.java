int log(int length) {
    if (length == 0) {
        throw new java.lang.ArithmeticException("Log of 0 is invalid");
    }
    int bit;
    for (bit = 0; length > 1; length >>= 2) {
        bit++;
    }
    return bit;
}