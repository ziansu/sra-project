public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    glGraphics.setGL(gl);
    synchronized(stateChanged) {
        if ((state) == (se.tribestar.mage.backend.gl.GLBackendController.GLGameState.Initialized))
            world = getWorld();
        
        world.resume();
        startTime = java.lang.System.nanoTime();
        if ((state) == (se.tribestar.mage.backend.gl.GLBackendController.GLGameState.Initialized))
            start();
        else
            resume();
        
        state = se.tribestar.mage.backend.gl.GLBackendController.GLGameState.Running;
    }
}