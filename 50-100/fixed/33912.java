public static int levelToExp(int level) {
    final int BASE = 3;
    final double RATE = 0.03;
    final int LINEAR_CAP = 9;
    if (level <= LINEAR_CAP) {
        return BASE + level;
    }
    return ((int) ((LINEAR_CAP + BASE) * (java.lang.Math.pow((1 + RATE), (level - LINEAR_CAP)))));
}