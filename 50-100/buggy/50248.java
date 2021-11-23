@java.lang.SuppressWarnings(value = "UnnecessaryLocalVariable")
private int getXCoordinate(int position) {
    int actualViewWidth = calculateActualViewWidth();
    int viewCenter = ((getWidth()) - actualViewWidth) / 2;
    int x = viewCenter;
    if (x < 0) {
        x = 0;
    }
    for (int i = 0; i < (count); i++) {
        x += (radiusPx) + (strokePx);
        if (position == i) {
            return x;
        }
        x += (radiusPx) + (paddingPx);
    }
    return x;
}