public static int oe(int opening, int endgame) {
    return (opening << 16) | (endgame & 65535);
}