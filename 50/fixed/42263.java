@java.lang.Override
protected void drawValue(android.graphics.Canvas c, java.lang.String value, float xPos, float yPos) {
    super.drawValue(c, value, xPos, (yPos + (mYOffset)));
}