public java.math.BigInteger toBigInt() {
    java.math.BigInteger output = java.math.BigInteger.ZERO;
    int power = 0;
    int base;
    for (int i = 0; i < (this.size()); i++) {
        boolean b = this.get(i);
        output.add(java.math.BigInteger.valueOf(((b ? 1 : 0) * (java.lang.Math.pow(2, power)))));
        power++;
    }
}