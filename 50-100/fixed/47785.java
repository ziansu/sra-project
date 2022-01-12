@java.lang.Override
public java.awt.geom.Point2D transform(java.lang.Object vertex) {
    java.awt.Point point = _points.get(vertex);
    if (point == null) {
        org.datacleaner.widgets.visualization.JobGraphLayoutTransformer.logger.warn("Vertex {} has no assigned coordinate!", vertex);
        point = new java.awt.Point(0, 0);
    }
    _transformed = true;
    return point;
}