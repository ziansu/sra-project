protected void runFocusScaleAnimation(@android.support.annotation.Nullable
android.view.View oldOrNewFocusView, float scaleX, float scaleY) {
    if (null == oldOrNewFocusView)
        return ;
    
    if ((scaleX != (oldOrNewFocusView.getScaleX())) || (scaleY != (oldOrNewFocusView.getScaleY()))) {
        oldOrNewFocusView.animate().scaleX(scaleX).scaleY(scaleY).setDuration(mAnimDuration).start();
    }
}