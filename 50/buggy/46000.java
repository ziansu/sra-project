@java.lang.Override
public void onNewBlockOfLines(java.util.List<thobe.logfileviewer.plugin.source.logline.ILogLine> blockOfLines) {
    this.lineBuffer.addAll(blockOfLines);
    this.eventSemaphore.release();
}