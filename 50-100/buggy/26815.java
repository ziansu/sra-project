private void removeAllGraphs() {
    for (int i = 0; (this.getComponentCount()) > 2;) {
        if ((this.getComponent(i)) instanceof org.diyefi.openlogviewer.graphing.SingleGraphPanel) {
            this.removeHierarchyBoundsListener(((org.diyefi.openlogviewer.graphing.SingleGraphPanel) (getComponent(i))));
            this.remove(getComponent(i));
        }else {
            i++;
        }
    }
    repaint();
}