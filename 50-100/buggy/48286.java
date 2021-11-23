protected void applyFitCenter(@android.support.annotation.NonNull
android.view.TextureView view, @android.support.annotation.NonNull
android.graphics.Matrix transformMatrix) {
    float xScale = ((float) (view.getWidth())) / (intrinsicVideoSize.x);
    float yScale = ((float) (view.getHeight())) / (intrinsicVideoSize.y);
    float scale = java.lang.Math.min(xScale, yScale);
    xScale = scale / xScale;
    yScale = scale / yScale;
    applyScale(view, transformMatrix, xScale, yScale);
}