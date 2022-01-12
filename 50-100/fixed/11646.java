private void generateColors() {
    if ((builder.colorsTop) != null) {
        colorsTop = builder.colorsTop;
        colorsSub = builder.colorsSub;
        return ;
    }
    if (builder.accentMode) {
        colorsTop = ColorPalette.ACCENT_COLORS;
        colorsSub = ColorPalette.ACCENT_COLORS_SUB;
    }else {
        colorsTop = ColorPalette.PRIMARY_COLORS;
        colorsSub = ColorPalette.PRIMARY_COLORS_SUB;
    }
}