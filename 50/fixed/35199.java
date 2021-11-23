public int getKind(java.lang.Long stmt) {
    return ((int) ((stmt & 30) >> 1));
}