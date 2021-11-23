@java.lang.Override
void setScaleTypeForActivity(com.iiordanov.bVNC.RemoteCanvasActivity activity) {
    super.setScaleTypeForActivity(activity);
    com.iiordanov.bVNC.RemoteCanvas canvas = activity.getCanvas();
    canvasXOffset = -(canvas.getCenteredXOffset());
    canvasYOffset = -(canvas.getCenteredYOffset());
    canvas.computeShiftFromFullToView();
    minimumScale = canvas.getMinimumScale();
    scaling = 1.0F;
    resetMatrix();
    canvas.setImageMatrix(matrix);
    resolveZoom(canvas);
}