public static int oe(int opening, int endgame) {
    return ((opening < 0 ? opening - 1 : opening) << 16) | (endgame & 65535);
}