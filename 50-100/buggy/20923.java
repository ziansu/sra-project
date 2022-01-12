@java.lang.Override
public void consumeParseRuleStart(long timestamp) {
    mParseFilesStartTimestamp = timestamp;
    if ((this.mParseProgress) == null) {
        this.mParseProgress = new com.facebook.buck.intellij.plugin.ui.tree.BuckTreeNodeDetail(mCurrentBuildRootElement, BuckTreeNodeDetail.DetailType.INFO, (("Current file parsing progress: " + (java.lang.Math.round(((mParseProgressValue) * 100)))) + "%"));
        com.intellij.openapi.application.ApplicationManager.getApplication().invokeLater(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                com.facebook.buck.intellij.plugin.ui.BuckEventsConsumer.this.mCurrentBuildRootElement.addChild(mParseProgress);
                com.facebook.buck.intellij.plugin.ui.BuckEventsConsumer.this.mTreeModel.reload();
            }
        });
    }
}