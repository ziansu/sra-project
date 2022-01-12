@java.lang.Override
public void draw(float delta) {
    super.draw(delta);
    font.drawWord(text, (((getX()) + (getWidth())) + (spacing)), (((getY()) + ((getHeight()) / 2)) - ((font.getFontHeight()) / 2)), scale, color);
}