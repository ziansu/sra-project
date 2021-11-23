@java.lang.Override
public void onPrepareCloseLogStream() {
    LOG().info(((this.getPluginName()) + " prepare to close LogStream."));
    this.lineBuffer.clear();
    this.eventSemaphore.release();
}