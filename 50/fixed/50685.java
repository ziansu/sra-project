public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
    gl.glClear(((javax.microedition.khronos.opengles.GL10.GL_COLOR_BUFFER_BIT) | (javax.microedition.khronos.opengles.GL10.GL_DEPTH_BUFFER_BIT)));
    gl.glMatrixMode(GL10.GL_MODELVIEW);
    renderRouteSegements(gl, routeSegments);
}