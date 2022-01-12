public void draw(alfredo.paint.Graphic g, float x, float y) {
    graphics.drawImage(g.render(), ((int) (translateX(x))), ((height) - ((int) (translateY(y)))), null);
}