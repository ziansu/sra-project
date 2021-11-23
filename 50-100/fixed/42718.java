public void unpressTouchedChild() {
    if ((mViewBeingTouched) != null) {
        mViewBeingTouched.setPressed(false);
        refreshDrawableState();
        if ((mSelectionListener) != null) {
            mSelectionListener.onItemSelected(mViewBeingTouched, false);
        }
        mViewBeingTouched = null;
    }
}