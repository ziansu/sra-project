public int calculate() {
    final int length = this.length;
    final boolean doesNotHaveMoreThan1Digit = !((getCurrentPosition()) < (text.length()));
    if ((length == 0) || doesNotHaveMoreThan1Digit) {
        return handleFailure();
    }else
        if (length >= 9) {
            return defaultCalculate();
        }else {
            return this.fastCalculate();
        }
    
}