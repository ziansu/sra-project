public void draw(android.graphics.Canvas canvas, float posx, float posy) {
    posx += getXOffset();
    posy += getYOffset();
    canvas.translate(posx, posy);
    draw(canvas);
    canvas.translate((-posx), (-posy));
}