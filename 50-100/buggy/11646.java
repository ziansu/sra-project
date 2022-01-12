private void generateColors() {
    if ((builder.colorsTop) != null) {
        android.util.Log.d("testtt", "colors top not null");
        colorsTop = builder.colorsTop;
        colorsSub = builder.colorsSub;
        return ;
    }
    if (builder.accentMode) {
        android.util.Log.d("testtt", "is accent mode");
        colorsTop = ColorPalette.ACCENT_COLORS;
        colorsSub = ColorPalette.ACCENT_COLORS_SUB;
    }else {
        android.util.Log.d("testtt", "is not accent mode");
        colorsTop = ColorPalette.PRIMARY_COLORS;
        colorsSub = ColorPalette.PRIMARY_COLORS_SUB;
    }
}