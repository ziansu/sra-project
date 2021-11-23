private static edu.petrov.gojavaonline.calculator.BigInteger _pow(edu.petrov.gojavaonline.calculator.BigInteger a, edu.petrov.gojavaonline.calculator.BigInteger n) {
    if (n.isZero()) {
        return new edu.petrov.gojavaonline.calculator.BigInteger(1);
    }
    if ((n.mod(2)) == 1) {
        return a.multiply(edu.petrov.gojavaonline.calculator.BigInteger._pow(a, n.subtract(1)));
    }else {
        edu.petrov.gojavaonline.calculator.BigInteger b = edu.petrov.gojavaonline.calculator.BigInteger._pow(a, n.divide(2));
        return a.multiply(b);
    }
}