private java.lang.String classify2Parameters(int a, int b) {
    if ((a > 0) && (b > 0)) {
        if (a == b) {
            return twoParamGuesses[0];
        }else {
            return twoParamGuesses[1];
        }
    }
    return "";
}