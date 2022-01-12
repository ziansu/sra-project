protected void applyCenter(@android.support.annotation.NonNull
android.view.TextureView view) {
    float xScale = ((float) (intrinsicVideoSize.x)) / (view.getWidth());
    float yScale = ((float) (intrinsicVideoSize.y)) / (view.getHeight());
    applyScale(view, xScale, yScale);
}