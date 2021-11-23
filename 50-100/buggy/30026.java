@java.lang.Override
public void dragDetected(org.eclipse.swt.events.DragDetectEvent dde) {
    if ((dde.button) != 1) {
        return ;
    }
    org.threadly.load.gui.AmbushGraph.GraphDataSet dataSet = this.currentDataSet;
    dataSet.movingPoint = getClosestPoint(dde.x, dde.y);
    if (((dataSet.movingPoint) == null) && (org.threadly.load.gui.AmbushGraph.zoomedIn(dataSet))) {
        dataSet.dragPoint = new org.eclipse.swt.graphics.Point(dde.x, dde.y);
    }
}