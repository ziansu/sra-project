public void setGraphPositionMax() {
    boolean found = false;
    for (int i = 0; (i < (multiGraph.getComponentCount())) && (!found); i++) {
        if ((multiGraph.getComponent(i)) instanceof org.diyefi.openlogviewer.graphing.SingleGraphPanel) {
            org.diyefi.openlogviewer.graphing.SingleGraphPanel gl = ((org.diyefi.openlogviewer.graphing.SingleGraphPanel) (multiGraph.getComponent(i)));
            graphPositionMax = gl.graphSize();
            found = true;
        }
    }
}