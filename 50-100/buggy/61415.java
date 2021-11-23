private void refreshColors() {
    for (int i = 0; i < (getChildCount()); i++) {
        com.arlib.floatingsearchview.util.Util.setIconColor(((android.widget.ImageView) (getChildAt(i))).getDrawable(), mActionIconColor);
        if ((mHasOverflow) && (i == ((getChildCount()) - 1)))
            com.arlib.floatingsearchview.util.Util.setIconColor(((android.widget.ImageView) (getChildAt(i))).getDrawable(), mOverflowIconColor);
        
    }
}