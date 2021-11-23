@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent event) {
    java.awt.Point point = event.getPoint();
    java.lang.System.out.println(("mousePressed at " + point));
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.startingX = point.x;
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.startingY = point.y;
    edu.ucsf.rbvi.clusterMaker2.internal.algorithms.pca.ScatterPlotPCA.dragging = true;
}