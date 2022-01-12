private long SHR3() {
    long jz = jsr;
    long jzr = jsr;
    jzr ^= jzr << 13;
    jzr ^= jzr >>> 17;
    jzr ^= jzr << 5;
    jsr = jzr;
    return jz + jzr;
}