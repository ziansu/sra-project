public void addNode(hokekyo1210.dojindb.sql.Node node) {
    hokekyo1210.dojindb.ui.NodeDetailPanel detail = new hokekyo1210.dojindb.ui.NodeDetailPanel(panelNum, ((panelWidth) - (scrollBarWidth)), hokekyo1210.dojindb.ui.BrowsePanel.detailPanelHeight, node, this);
    detail.reloadBounds(0, ((panelNum) * (hokekyo1210.dojindb.ui.BrowsePanel.detailPanelHeight)));
    panels.add(detail);
    ground.add(detail);
    (panelNum)++;
}