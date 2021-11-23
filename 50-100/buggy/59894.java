public int greatestCommonDivisor(int a, int b) {
    int rem;
    if (a > b) {
        rem = a % b;
        if (rem != 0) {
            return greatestCommonDivisor(a, rem);
        }
        return b;
    }else {
        rem = b % a;
        if (rem != 0) {
            return greatestCommonDivisor(b, rem);
        }
        return a;
    }
}