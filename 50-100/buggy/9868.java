public lib.Number push(char digit) {
    if ((!(this.hasDecimal)) || (digit != '.')) {
        this.hasDecimal = (this.hasDecimal) || (digit != '.');
        this.state += digit;
    }
    return this;
}