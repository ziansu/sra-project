public java.math.BigInteger toBigInt() {
    java.math.BigInteger output = java.math.BigInteger.ZERO;
    int power = 0;
    int base;
    for (int i = 0; i < (this.size()); i++) {
        boolean b = this.get(i);
        int temp = 0;
        if (b) {
            temp = 1;
        }
        output.add(java.math.BigInteger.valueOf((temp * (java.lang.Math.pow(2, power)))));
        power++;
    }
}