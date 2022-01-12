@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent event) {
    java.awt.Point p = event.getPoint();
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.currentX = p.x;
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.currentY = p.y;
    if (edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.dragging) {
        repaint();
    }
}