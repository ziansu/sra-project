@java.lang.Override
void zoomOut(com.iiordanov.bVNC.RemoteCanvasActivity activity) {
    resetMatrix();
    standardizeScaling();
    scaling -= 0.25;
    if ((scaling) < (minimumScale)) {
        scaling = minimumScale;
    }
    matrix.postScale(scaling, scaling);
    activity.getCanvas().setImageMatrix(matrix);
    resolveZoom(activity.getCanvas());
}