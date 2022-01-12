private java.math.BigInteger generateN() {
    q = primeNumber();
    p = primeNumber();
    if (!(q.equals(p)))
        return p.multiply(q);
    
    return null;
}