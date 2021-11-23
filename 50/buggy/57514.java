@java.lang.Override
protected void onDetachedFromWindow() {
    if (((getProgressMode()) == (com.rey.material.widget.ProgressView.MODE_INDETERMINATE)) && (mAutostart))
        stop();
    
    super.onDetachedFromWindow();
}