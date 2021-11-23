public static int getColorWithAlpha(int color, float ratio) {
    int newColor = 0;
    int alpha = java.lang.Math.round(((android.graphics.Color.alpha(color)) * ratio));
    int r = android.graphics.Color.red(color);
    int g = android.graphics.Color.green(color);
    int b = android.graphics.Color.blue(color);
    newColor = android.graphics.Color.argb(alpha, r, g, b);
    return newColor;
}