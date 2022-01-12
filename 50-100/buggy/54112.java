protected void applyCenter(@android.support.annotation.NonNull
android.view.TextureView view, @android.support.annotation.NonNull
android.graphics.Matrix transformMatrix) {
    float xScale = ((float) (intrinsicVideoSize.x)) / (view.getWidth());
    float yScale = ((float) (intrinsicVideoSize.y)) / (view.getHeight());
    applyScale(view, transformMatrix, xScale, yScale);
}