protected void applyCenterInside(@android.support.annotation.NonNull
android.view.TextureView view) {
    if (((intrinsicVideoSize.x) <= (view.getWidth())) && ((intrinsicVideoSize.y) <= (view.getHeight()))) {
        applyCenter(view);
    }else {
        applyFitCenter(view);
    }
}