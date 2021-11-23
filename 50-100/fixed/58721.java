@java.lang.Override
public void performLoopFrame() {
    if ((prevTime) == 0)
        prevTime = ((int) (com.shc.silenceengine.utils.TimeUtils.currentTime()));
    
    float currTime = ((float) (com.shc.silenceengine.utils.TimeUtils.currentTime()));
    float elapsedTime = currTime - (prevTime);
    prevTime = currTime;
    SilenceEngine.eventManager.raiseUpdateEvent(elapsedTime);
    com.shc.silenceengine.graphics.opengl.GLContext.clear(((GL_COLOR_BUFFER_BIT) | (GL_DEPTH_BUFFER_BIT)));
    SilenceEngine.eventManager.raiseRenderEvent(elapsedTime);
}