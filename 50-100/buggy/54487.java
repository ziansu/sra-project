@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    boolean bFlag = super.onTouchEvent(event);
    final net.qiujuer.genius.ui.drawable.TouchEffectDrawable d = mTouchDrawable;
    if ((d != null) && (isEnabled())) {
        d.onTouch(event);
        return true;
    }
    return bFlag;
}