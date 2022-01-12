@java.lang.Override
protected void onDetachedFromWindow() {
    if (mAutostart)
        stop();
    
    super.onDetachedFromWindow();
}