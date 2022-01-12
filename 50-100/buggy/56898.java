private java.lang.String classify2Parameters(int a, int b) {
    if (a == b) {
        return twoParamGuesses[0];
    }else
        if (a == 0) {
            if (b > 0) {
                return twoParamGuesses[1];
            }
        }else
            if (a > 1) {
                if (b != 0) {
                    return twoParamGuesses[1];
                }
            }
        
    
    return "";
}