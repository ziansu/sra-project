private static java.math.BigInteger recombine(dk.alexandra.fresco.suite.bgw.ShamirShare[] shares) {
    java.math.BigInteger s = java.math.BigInteger.ZERO;
    for (int inx = 0; inx < (dk.alexandra.fresco.suite.bgw.ShamirShare.vector.length); inx++) {
        dk.alexandra.fresco.suite.bgw.ShamirShare share = shares[inx];
        s = s.add(share.fieldValue.multiply(dk.alexandra.fresco.suite.bgw.ShamirShare.vector[inx]).mod(dk.alexandra.fresco.suite.bgw.ShamirShare.primeNumber)).mod(dk.alexandra.fresco.suite.bgw.ShamirShare.primeNumber);
    }
    return s.mod(dk.alexandra.fresco.suite.bgw.ShamirShare.primeNumber);
}