private void delayedHide(int delayMillis) {
    mHideHandler.removeMessages(0);
    mHideHandler.sendEmptyMessageDelayed(0, delayMillis);
}