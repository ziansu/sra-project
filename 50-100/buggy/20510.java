@java.lang.Override
protected void onVisibilityChanged(@android.support.annotation.NonNull
android.view.View changedView, int visibility) {
    super.onVisibilityChanged(changedView, visibility);
    if (((getProgressMode()) == (com.rey.material.widget.ProgressView.MODE_INDETERMINATE)) && (mAutostart)) {
        if ((visibility == (GONE)) || (visibility == (INVISIBLE)))
            stop();
        else
            start();
        
    }
}