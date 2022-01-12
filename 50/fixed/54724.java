private int random(int min, int max) {
    max = max - min;
    return min + (max > 0 ? rdn.nextInt(max) : 0);
}