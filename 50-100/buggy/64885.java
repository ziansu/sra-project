public void ExtendedEuclid() {
    do {
        d = java.math.BigInteger.valueOf(1).mod(phiN).divide(e);
    } while (d.compareTo((((java.math.BigInteger.valueOf(1)) != 1) && ((d.compareTo(phiN)) != 1))) );
}