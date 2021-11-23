public com.aventura.model.camera.Camera createCamera() {
    com.aventura.math.vector.Vector4 eye = new com.aventura.math.vector.Vector4(0, (-5), 0, 1);
    com.aventura.math.vector.Vector4 poi = new com.aventura.math.vector.Vector4(0, 0, 0, 1);
    com.aventura.model.camera.Camera cam = new com.aventura.model.camera.Camera(eye, poi, com.aventura.math.vector.Vector4.Z_AXIS);
    return cam;
}