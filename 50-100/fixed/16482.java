public void draw(android.graphics.Canvas canvas, float posx, float posy) {
    posx += getXOffset(posx);
    posy += getYOffset(posy);
    canvas.translate(posx, posy);
    draw(canvas);
    canvas.translate((-posx), (-posy));
}