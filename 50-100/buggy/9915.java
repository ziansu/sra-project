@java.lang.Override
public void doRefreshVisual(org.eclipse.gef.fx.nodes.GeometryNode<org.eclipse.gef.geometry.planar.IGeometry> visual) {
    if ((getAnchoragesUnmodifiable().size()) != 1) {
        return ;
    }
    org.eclipse.gef.geometry.planar.IGeometry feedbackGeometry = getFeedbackGeometry();
    if (feedbackGeometry == null) {
        return ;
    }
    visual.setGeometry(feedbackGeometry);
    if (feedbackGeometry instanceof org.eclipse.gef.geometry.planar.ICurve) {
        visual.setStrokeType(javafx.scene.shape.StrokeType.CENTERED);
    }else {
        visual.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
    }
}