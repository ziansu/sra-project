public float getRotation() {
    com.jme3.math.Vector2f wallDir = new com.jme3.math.Vector2f(((getStart().getX()) + (getEnd().getX())), ((getStart().getY()) + (getEnd().getY())));
    return wallDir.angleBetween(new com.jme3.math.Vector2f(1.0F, 0.0F));
}