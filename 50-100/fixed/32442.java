@java.lang.Override
public void performImageAction() {
    queueSelectionMask(mask);
    startStroke(params, points[0], builtImage);
    for (int i = 1; i < (points.length); ++i) {
        engine.stepStroke(points[i]);
    }
    engine.endStroke();
}