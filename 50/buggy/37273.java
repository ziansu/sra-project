private java.math.BigInteger generateN() {
    java.math.BigInteger q = primeNumber();
    java.math.BigInteger p = primeNumber();
    if (!(q.equals(p)))
        return p.multiply(q);
    
    return null;
}