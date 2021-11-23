public edu.petrov.gojavaonline.calculator.BigInteger pow(int a) {
    a = java.lang.Math.abs(a);
    if (a == 0) {
        return new edu.petrov.gojavaonline.calculator.BigInteger(0);
    }
    edu.petrov.gojavaonline.calculator.BigInteger result = new edu.petrov.gojavaonline.calculator.BigInteger(this);
    while (a > 1) {
        result = result._multiply(result);
        a--;
    } 
    return result;
}