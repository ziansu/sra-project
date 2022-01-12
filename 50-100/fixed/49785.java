public void setColor(int item, @android.support.annotation.ColorInt
int color) {
    if ((((colors) == null) || (item >= (colors.length))) || (item < 0)) {
        return ;
    }
    colors[item] = color;
    if (item == (active)) {
        currentColor = color;
        if ((mRevealBackgroundView) != null) {
            mRevealBackgroundView.setBackgroundColor(color);
        }
    }
}