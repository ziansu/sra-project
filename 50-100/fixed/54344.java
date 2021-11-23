public boolean shift(boolean a) {
    boolean rc = this.bits[0];
    for (int i = 0; i < ((bits.length) - 1); i++) {
        bits[i] = bits[(i + 1)];
    }
    bits[((bits.length) - 1)] = a;
    return rc;
}