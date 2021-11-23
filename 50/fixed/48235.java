protected android.graphics.drawable.Drawable getDrawable() {
    android.graphics.Canvas canvas = new android.graphics.Canvas();
    shape.draw(canvas);
    this.draw(canvas);
    return shape;
}