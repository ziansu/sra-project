public void setFrustum(float fovy, float aspect, float znear, float zfar) {
    org.joml.Matrix4f projMatrix = new org.joml.Matrix4f();
    projMatrix.perspective(((float) (java.lang.Math.toRadians(fovy))), aspect, znear, zfar);
    setFrustum(projMatrix);
}