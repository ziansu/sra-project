public static boolean isValid(int number, int size) {
    int digit;
    if (number < ((java.lang.Math.pow(10, (size - 1))) - 1)) {
        return false;
    }
    for (int i = 0; i < (size - 1); i++) {
        digit = number % 10;
        number = number / 10;
        if (digit <= (number % 10))
            return false;
        
    }
    return true;
}