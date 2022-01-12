public edu.petrov.gojavaonline.calculator.BigInteger High() {
    if ((size()) == 0) {
        return new edu.petrov.gojavaonline.calculator.BigInteger();
    }else
        if ((size()) == 1) {
            return new edu.petrov.gojavaonline.calculator.BigInteger(this);
        }else {
            edu.petrov.gojavaonline.calculator.BigInteger result = new edu.petrov.gojavaonline.calculator.BigInteger(java.util.Arrays.copyOfRange(digits.toArray(new java.lang.Integer[0]), halfSize(), digits.size()));
            return result;
        }
    
}