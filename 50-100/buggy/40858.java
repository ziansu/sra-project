static int measureText(java.lang.String string, float textSize) {
    org.ppsspp.ppsspp.Paint p;
    p = new org.ppsspp.ppsspp.Paint(Paint.ANTI_ALIAS_FLAG);
    org.ppsspp.ppsspp.Rect bound = new org.ppsspp.ppsspp.Rect();
    p.setTextSize(textSize);
    p.getTextBounds(string, 0, string.length(), bound);
    int packedBounds = ((bound.width()) << 16) | (bound.height());
    return packedBounds;
}