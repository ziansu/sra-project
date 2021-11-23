public void onOutputFinished(boolean ensureVisible) {
    flushQueuedErrors(ensureVisible);
    if ((state_) == (org.rstudio.studio.client.workbench.views.source.editors.text.ChunkOutputWidget.CHUNK_PRE_OUTPUT)) {
        emptyIndicator_.setVisible(true);
        if ((vconsole_) != null)
            vconsole_.clear();
        
        root_.clear();
        hasErrors_ = false;
    }
    syncHeight(true, ensureVisible);
    state_ = org.rstudio.studio.client.workbench.views.source.editors.text.ChunkOutputWidget.CHUNK_READY;
    lastOutputType_ = org.rstudio.studio.client.rmarkdown.model.RmdChunkOutputUnit.TYPE_NONE;
    setOverflowStyle();
    showReadyState();
}