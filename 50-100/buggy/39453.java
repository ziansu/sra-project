public static edu.petrov.gojavaonline.calculator.BigInteger factorial(edu.petrov.gojavaonline.calculator.BigInteger n) {
    edu.petrov.gojavaonline.calculator.BigInteger result = edu.petrov.gojavaonline.calculator.BigInteger.ONE;
    while (!(n.equals(edu.petrov.gojavaonline.calculator.BigInteger.ZERO))) {
        result = result.multiply(n);
        n = n.subtract(edu.petrov.gojavaonline.calculator.BigInteger.ONE);
    } 
    return result;
}