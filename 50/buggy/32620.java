public java.lang.Double getDouble() {
    int number = data.number;
    if (data.negativeNumber) {
        number *= -1;
    }
    double result = number;
    result += (decimal) / (java.lang.Math.pow(10, decimalDigits));
    return result;
}