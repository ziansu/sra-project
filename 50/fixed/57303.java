public boolean digitsAllEven() {
    for (int i = offset; i < (digits.length); i++) {
        if (((digits[i]) & 1) != 0)
            return false;
        
    }
    return true;
}