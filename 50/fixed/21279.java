public static boolean hasEdge(int v1, int v2) {
    return ((v1 ^ v2) != 0) && (((v1 ^ v2) & ((v1 ^ v2) - 1)) == 0);
}