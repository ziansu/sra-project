private void resetStickyFooterSelection() {
    if ((mStickyFooterView) instanceof android.widget.LinearLayout) {
        for (int i = 1; i < (((android.widget.LinearLayout) (mStickyFooterView)).getChildCount()); i++) {
            if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
                ((android.widget.LinearLayout) (mStickyFooterView)).getChildAt(i).setActivated(false);
            }
            ((android.widget.LinearLayout) (mStickyFooterView)).getChildAt(i).setSelected(false);
        }
    }
}