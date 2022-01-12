@java.lang.Override
public void applyChanges() {
    java.util.Set<java.lang.String> selectedNodeIds = getSelectedNodeIds();
    java.util.Set<java.lang.String> selectedEdgeIds = getSelectedEdgeIds();
    applyNodeCollapse();
    applyInvisibility();
    applyJoinEdgesAndSkipEdgeless();
    applyShowEdgesInMetaNode();
    applyHighlights();
    viewer.getGraphLayout().setGraph(de.bund.bfr.knime.gis.views.canvas.CanvasUtils.createGraph(nodes, edges));
    setSelectedNodeIds(selectedNodeIds);
    setSelectedEdgeIds(selectedEdgeIds);
    viewer.repaint();
}