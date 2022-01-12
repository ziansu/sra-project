protected void applyCenterInside(@android.support.annotation.NonNull
android.view.TextureView view, @android.support.annotation.NonNull
android.graphics.Matrix transformMatrix) {
    if (((intrinsicVideoSize.x) <= (view.getWidth())) && ((intrinsicVideoSize.y) <= (view.getHeight()))) {
        applyCenter(view, transformMatrix);
    }else {
        applyFitCenter(view, transformMatrix);
    }
}