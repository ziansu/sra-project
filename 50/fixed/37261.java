@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    if ((w > 0) && (h > 0)) {
        regenerateBackground();
    }
}