private android.graphics.Point getRandomPoint(int baseX, int baseY, int r) {
    if (r <= 0) {
        r = 1;
    }
    int x = mRandom.nextInt(r);
    int y = ((int) (java.lang.Math.sqrt(((r * r) - (x * x)))));
    x = baseX + (getRandomPNValue(x));
    y = baseY + (getRandomPNValue(y));
    return new android.graphics.Point(x, y);
}