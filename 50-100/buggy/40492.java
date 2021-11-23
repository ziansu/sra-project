public void resetAndRedraw(boolean edgeVisible) {
    this.graphContentGroup.getChildren().remove(this.panelRoot.getGraphics());
    org.ucombinator.jaam.visualizer.gui.LayoutAlgorithm.layout(this.panelRoot);
    this.resetPanelSize();
    this.getPanelRoot().setEdgeVisibility(edgeVisible);
    this.drawGraph();
    this.initZoom();
    java.lang.System.out.println(("Scale: " + (this.factorX)));
}