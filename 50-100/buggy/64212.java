public final int getBitsForMaxValue(int value) {
    int bits = 32;
    while ((((1 << (bits - 1)) & value) == 0) || (bits == 1)) {
        bits--;
    } 
    return bits;
}