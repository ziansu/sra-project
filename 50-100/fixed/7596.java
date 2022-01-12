public static int fastRecursiveExponentiationModulo(int base, int exponent, int mod) {
    if (exponent == 0)
        return 1;
    
    if (exponent == 1)
        return base;
    
    final int resultOnHalfExponent = com.jwetherell.algorithms.mathematics.Exponentiation.fastRecursiveExponentiationModulo(base, (exponent / 2), mod);
    if ((exponent % 2) == 0)
        return (resultOnHalfExponent * resultOnHalfExponent) % mod;
    else
        return (((resultOnHalfExponent * resultOnHalfExponent) % mod) * base) % mod;
    
}