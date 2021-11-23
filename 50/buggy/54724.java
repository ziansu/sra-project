private int random(int min, int max) {
    return min + (max > 0 ? rdn.nextInt(max) : 0);
}