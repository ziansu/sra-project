public int reverseBits(int n) {
    int result = 0;
    for (int i = 1; i != 0; i <<= 1) {
        result <<= 1;
        if ((n & 1) > 0) {
            result |= 1;
        }
        n >>= 1;
    }
    return result;
}