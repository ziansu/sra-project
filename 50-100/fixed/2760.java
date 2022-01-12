@java.lang.Override
public void projectOpened() {
    if (isAdaptiveProject()) {
        java.io.File indexHtml = new java.io.File(myProject.getBasePath(), me.adaptive.ide.plugins.nibble.NibbleComponent.DEFAULT_INDEX_PATH);
        if ((indexHtml.exists()) && (!(isRunning()))) {
            runOnNibble(indexHtml);
        }
    }
}