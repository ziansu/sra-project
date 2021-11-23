protected void createPaints() {
    pText = new android.graphics.Paint();
    pText.setColor(Color.LTGRAY);
    pText.setTextAlign(Paint.Align.CENTER);
    pText.setTextSize(((columnWidth) * 0.5F));
    pText.setAntiAlias(true);
    pBar = new android.graphics.Paint();
    pBar.setTextAlign(Paint.Align.CENTER);
    pBar.setTextSize(((columnWidth) * 0.5F));
    pBar.setAntiAlias(true);
}