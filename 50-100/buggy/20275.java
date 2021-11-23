public static final void adjustTextSize(final javafx.scene.text.Text TEXT, final double MAX_WIDTH, double fontSize) {
    final java.lang.String FONT_NAME = TEXT.getFont().getName();
    while (((TEXT.getLayoutBounds().getWidth()) > MAX_WIDTH) | (fontSize < 0)) {
        fontSize -= 0.005;
        TEXT.setFont(new javafx.scene.text.Font(FONT_NAME, fontSize));
    } 
}