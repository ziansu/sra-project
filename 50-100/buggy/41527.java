private void ROR() {
    c = (a) & 1;
    a >>= 1;
    a |= (c) << 7;
    z = 0;
    if ((a) == 0) {
        z = 1;
    }
    n = (a) >> 7;
}