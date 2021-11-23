Vector2D left() {
    float m = x;
    x = -(y);
    y = m;
    return this;
}