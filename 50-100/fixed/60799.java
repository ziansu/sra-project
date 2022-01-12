@java.lang.Override
public void consumeBuckBuildProgressUpdate(long timestamp, double progressValue) {
    if ((mBuildProgress) == null) {
        consumeBuildStart(timestamp);
    }
    mBuildProgressValue = progressValue;
    final java.lang.String message = ("Current build progress: " + (java.lang.Math.round(((mBuildProgressValue) * 100)))) + "%";
    this.mBuildProgress.setDetail(message);
    com.intellij.openapi.application.ApplicationManager.getApplication().invokeLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.facebook.buck.intellij.plugin.ui.BuckEventsConsumer.this.mTreeModel.reload();
        }
    });
}