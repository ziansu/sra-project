public de.tEngine.math.Matrix4f getToWorldMatrix() {
    de.tEngine.math.Matrix4f world = de.tEngine.math.Matrix4f.translationMatrix(transform.getPosition());
    world.mul(de.tEngine.math.Matrix4f.rotationMatrix(transform.getRotation()));
    world.mul(de.tEngine.math.Matrix4f.scalingMatrix(range, range, range));
    return world;
}