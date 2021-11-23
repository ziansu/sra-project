@java.lang.Override
public void close() throws java.io.IOException {
    isStared.set(false);
    isRunning.set(false);
    if ((fileWatcher) != null)
        fileWatcher.cancel();
    
    if ((fileChannel) != null) {
        fileChannel.close();
    }
    if ((buffer) != null) {
        buffer.flip();
        buffer.clear();
        buffer = null;
    }
    fileWatcher = null;
    com.kyj.fx.voeditor.visual.component.text.LogViewController.LOGGER.debug("Close Complate!");
}