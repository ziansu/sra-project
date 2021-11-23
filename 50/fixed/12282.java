private int getDigit(int index) {
    if ((index >= (digits.size())) || (index < 0)) {
        return 0;
    }
    return digits.get(index);
}