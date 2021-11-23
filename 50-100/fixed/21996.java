public void camera(com.watabou.noosa.Camera camera) {
    if (camera == null) {
        camera = Camera.main;
    }
    if ((camera != (lastCamera)) && ((camera.matrix) != null)) {
        lastCamera = camera;
        uCamera.valueM4(camera.matrix);
        android.opengl.GLES20.glScissor(camera.x, (((Game.height) - (camera.screenHeight)) - (camera.y)), camera.screenWidth, camera.screenHeight);
    }
}