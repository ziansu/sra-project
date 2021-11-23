public java.lang.Double getDouble() {
    double result = data.number;
    result += (decimal) / (java.lang.Math.pow(10, decimalDigits));
    if (data.negativeNumber) {
        result = -result;
    }
    return result;
}