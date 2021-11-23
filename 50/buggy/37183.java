public int getStyle(int styleId, int theme) {
    int[] styles = getStyleList(styleId);
    return styles[theme];
}