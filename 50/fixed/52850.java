public edu.petrov.gojavaonline.calculator.BigInteger mod(edu.petrov.gojavaonline.calculator.BigInteger divider) {
    edu.petrov.gojavaonline.calculator.BigInteger[] result = divideAndRemainder(divider);
    return result[1];
}