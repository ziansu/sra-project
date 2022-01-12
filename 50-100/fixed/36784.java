public java.lang.Double calculate(java.util.List<java.lang.Double> _inputPolynomial, java.lang.Double x) {
    java.lang.Double result = 0.0;
    int size = _inputPolynomial.size();
    for (java.lang.Double val : _inputPolynomial) {
        if ((--size) == 0) {
            result += val;
        }else {
            result += val * (java.lang.Math.pow(x, size));
        }
    }
    return result;
}