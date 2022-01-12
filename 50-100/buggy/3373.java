public static float getTextWidth(java.lang.CharSequence text, mocha.graphics.Font font, float width, float screenScale) {
    width = mocha.graphics.TextDrawing.constrainWidth(width);
    float[] measuredWidth = new float[]{ 0.0F };
    font.paintForScreenScale(screenScale).breakText(text, 0, text.length(), true, width, measuredWidth);
    return measuredWidth[0];
}