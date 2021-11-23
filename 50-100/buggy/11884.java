@com.facebook.react.bridge.ReactMethod
public void startRecordingFps() {
    if (!(mCatalystSettings.isAnimationFpsDebugEnabled())) {
        return ;
    }
    if ((mFrameCallback) != null) {
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Already recording FPS!");
    }
    com.facebook.react.modules.debug.AnimationsDebugModule.checkAPILevel();
    mFrameCallback = new com.facebook.react.modules.debug.FpsDebugFrameCallback(android.view.Choreographer.getInstance(), getReactApplicationContext());
    mFrameCallback.startAndRecordFpsAtEachFrame();
}