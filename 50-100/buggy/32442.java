@java.lang.Override
public void performImageAction() {
    queueSelectionMask(mask);
    spirite.image_data.DrawEngine.StrokeEngine engine = workspace.getDrawEngine().startStrokeEngine(builtImage);
    engine.startStroke(params, points[0]);
    for (int i = 1; i < (points.length); ++i) {
        engine.updateStroke(points[i]);
        engine.stepStroke();
    }
    engine.endStroke();
}