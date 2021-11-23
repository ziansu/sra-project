@java.lang.Override
public void dismiss() {
    if ((mTiedView) != null) {
        android.view.ViewTreeObserver vto = mTiedView.getViewTreeObserver();
        vto.removeOnScrollChangedListener(this);
        if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN)) {
            vto.removeGlobalOnLayoutListener(this);
        }else {
            vto.removeOnGlobalLayoutListener(this);
        }
    }
    super.dismiss();
}