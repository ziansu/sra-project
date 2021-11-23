public static boolean isValid(int number, int size) {
    int digit;
    for (int i = 0; i < (size - 1); i++) {
        digit = number % 10;
        number = number / 10;
        if (digit <= (number % 10))
            return false;
        
    }
    return true;
}