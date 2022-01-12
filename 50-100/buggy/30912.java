@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    if (((gameEngine) != null) && (gameEngine.is))
        try {
            gameEngine.start();
            gameEngine.setDims(getWidth(), getHeight());
        } catch (java.lang.Exception ignored) {
        }
    
    if ((engineEventCallbacks) != null)
        engineEventCallbacks.onStart();
    
}