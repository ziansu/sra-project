protected int modularPow(int _base, int _exponent, int _modulus) {
    int modulus = _modulus;
    int result = 1;
    int base = _base % _modulus;
    int exponent = _exponent;
    while (exponent > 0) {
        if ((exponent % 2) == 1) {
            result = (result * base) % modulus;
        }
        exponent = exponent >> 1;
        base = (base * base) % modulus;
    } 
    return result;
}