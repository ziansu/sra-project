private void delayedHide(int delayMillis) {
    android.util.Log.d("BackEnd", ("On method delayedHide " + delayMillis));
    mHideHandler.removeMessages(0);
    mHideHandler.sendEmptyMessageDelayed(0, delayMillis);
}