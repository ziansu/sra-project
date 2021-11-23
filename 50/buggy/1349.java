public void rotate(float angle) {
    rotation += angle;
    model.rotate(angle, new org.lwjgl.util.vector.Vector3f(0.0F, 0.0F, 1.0F));
}