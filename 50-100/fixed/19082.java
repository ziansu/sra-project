protected void runFocusScaleAnimation(@android.support.annotation.Nullable
final android.view.View oldOrNewFocusView, final float scaleX, final float scaleY) {
    if (null == oldOrNewFocusView)
        return ;
    
    oldOrNewFocusView.animate().scaleX(scaleX).scaleY(scaleY).setDuration(mAnimDuration).start();
}