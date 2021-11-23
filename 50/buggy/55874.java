public void updateTransform() {
    if (isDirty) {
        transform = new com.badlogic.gdx.math.Matrix3().mul(scale).mul(rotation).mul(translation);
    }
}