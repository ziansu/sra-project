@java.lang.Override
public void consumeParseRuleEnd(long timestamp) {
    consumeParseRuleProgressUpdate(timestamp, 1.0F);
    mParseFilesEndTimestamp = timestamp;
    float duration = ((mParseFilesEndTimestamp) - (mParseFilesStartTimestamp)) / 1000;
    final java.lang.String message = ("File parsing ended, took " + duration) + " seconds!";
    this.mParseProgress.setDetail(message);
    com.intellij.openapi.application.ApplicationManager.getApplication().invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.facebook.buck.intellij.plugin.ui.BuckEventsConsumer.this.mTreeModel.reload();
        }
    });
}