@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((timerEnabled) == true) {
        offsetEnd = java.lang.System.currentTimeMillis();
        delayms = (delayms) - ((offsetEnd) - (offsetStart));
    }
}