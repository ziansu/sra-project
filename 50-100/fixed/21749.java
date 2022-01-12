@java.lang.Override
void setScaleTypeForActivity(com.iiordanov.bVNC.RemoteCanvasActivity activity) {
    super.setScaleTypeForActivity(activity);
    com.iiordanov.bVNC.RemoteCanvas canvas = activity.getCanvas();
    canvasXOffset = -(canvas.getCenteredXOffset());
    canvasYOffset = -(canvas.getCenteredYOffset());
    canvas.computeShiftFromFullToView();
    minimumScale = canvas.getMinimumScale();
    if ((minimumScale) > 1.0F) {
        scaling = minimumScale;
    }else {
        scaling = 1.0F;
    }
    resolveZoom(canvas);
}