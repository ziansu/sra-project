@java.lang.Override
protected void onVisibilityChanged(@android.support.annotation.NonNull
android.view.View changedView, int visibility) {
    super.onVisibilityChanged(changedView, visibility);
    if (changedView != (this))
        return ;
    
    if (mAutostart) {
        if ((visibility == (GONE)) || (visibility == (INVISIBLE)))
            stop();
        else
            start();
        
    }
}