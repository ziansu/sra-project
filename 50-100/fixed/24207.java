processing.javafx.PGraphicsFX2D.FontInfo createFontInfo(javafx.scene.text.Font font) {
    processing.javafx.PGraphicsFX2D.FontInfo result = new processing.javafx.PGraphicsFX2D.FontInfo();
    result.font = font;
    if (font != null) {
        measuringText.setFont(result.font);
        measuringText.setText(" ");
        float lineHeight = ((float) (measuringText.getLayoutBounds().getHeight()));
        result.ascent = ((float) (measuringText.getBaselineOffset()));
        result.descent = lineHeight - (result.ascent);
    }
    return result;
}