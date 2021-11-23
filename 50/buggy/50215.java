public org.joml.Matrix4f getProjection(org.joml.Matrix4f target) {
    target.scale(scale);
    target.translate(pos);
    return target;
}