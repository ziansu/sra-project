public final void setLog(final org.diyefi.openlogviewer.genericlog.GenericLog genLog) {
    playing = false;
    resetGraphPosition();
    multiGraph.setLog(genLog);
    graphPositionPanel.setLog(genLog);
}