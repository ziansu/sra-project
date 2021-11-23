@java.lang.Override
public void onLeftClick(double x, double y) {
    clickedPoint = new irmb.flowsim.model.Point(x, y);
    irmb.flowsim.view.graphics.PaintableShape paintableShape = getPaintableShapeAt(x, y);
    if (paintableShape != null)
        moveShapeCommand = new irmb.flowsim.presentation.command.MoveShapeCommand(paintableShape.getShape());
    
}