public int run() {
    int exponent = 1000;
    java.math.BigInteger base = java.math.BigInteger.valueOf(2);
    java.math.BigInteger value = java.math.BigInteger.ZERO;
    int sum = 0;
    value = base.pow(exponent);
    java.lang.String str = value.toString();
    for (int i = 0; i < (str.length()); i++)
        sum += ((int) ((str.charAt(i)) - '0'));
    
    return sum;
}