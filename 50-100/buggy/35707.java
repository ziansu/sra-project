public void setFrustum(float fovy, float aspect, float znear, float zfar) {
    org.joml.Matrix4f projMatrix = new org.joml.Matrix4f();
    projMatrix.perspective(fovy, ((float) (java.lang.Math.toRadians(aspect))), znear, zfar);
    setFrustum(projMatrix);
}