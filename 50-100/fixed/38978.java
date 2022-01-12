@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
        tipShow.mainBottom = true;
        tipShow.setShowViewLocation(true, false, false, true, true);
        tipShow.addTip(this, textView, imageView);
    }
}