private void invokeRenderProgressCallback(java.lang.String info) {
    renderProgressCallback.invoke(com.shc.silenceengine.core.Game.getBatcher(), updateProgress(), info);
}