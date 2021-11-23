@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    final net.qiujuer.genius.ui.drawable.TouchEffectDrawable d = mTouchDrawable;
    if ((d != null) && (isEnabled())) {
        d.onTouch(event);
        super.onTouchEvent(event);
        return true;
    }
    return super.onTouchEvent(event);
}