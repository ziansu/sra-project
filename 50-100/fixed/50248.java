@java.lang.SuppressWarnings(value = "UnnecessaryLocalVariable")
private int getXCoordinate(int position) {
    int x = 0;
    for (int i = 0; i < (count); i++) {
        x += (radiusPx) + (strokePx);
        if (position == i) {
            return x;
        }
        x += (radiusPx) + (paddingPx);
    }
    return x;
}