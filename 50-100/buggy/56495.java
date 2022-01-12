@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
    gl.glClear(((javax.microedition.khronos.opengles.GL10.GL_COLOR_BUFFER_BIT) | (javax.microedition.khronos.opengles.GL10.GL_DEPTH_BUFFER_BIT)));
    for (bp.uhk.arapp.ar.WorldObject o : objects) {
        gl.glMultMatrixf(rotationMatrix, 0);
        gl.glRotatef(90, 1, 0, 0);
        gl.glRotatef(yawFix, 0, 1.0F, 0);
        o.draw(gl);
    }
}