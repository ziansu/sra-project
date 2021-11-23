private void refreshColors() {
    for (int i = 0; i < (getChildCount()); i++) {
        com.arlib.floatingsearchview.util.Util.setIconColor(((android.widget.ImageView) (getChildAt(i))), mActionIconColor);
        if ((mHasOverflow) && (i == ((getChildCount()) - 1))) {
            com.arlib.floatingsearchview.util.Util.setIconColor(((android.widget.ImageView) (getChildAt(i))), mOverflowIconColor);
        }
    }
}