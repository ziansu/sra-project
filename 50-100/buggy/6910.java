public void modulo(pl.kryptografia.rabin.bignum.BigNum modulus) {
    while (absGreaterOrEqualTo(modulus)) {
        pl.kryptografia.rabin.bignum.BigNum x = new pl.kryptografia.rabin.bignum.BigNum(modulus);
        int shift = findMaximumLeftShift(x);
        x.shiftLeft(shift);
        absSubtract(x);
    } 
    if ((sign) == (-1)) {
        sign = 1;
        add(modulus);
    }
}