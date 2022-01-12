private void updateFabState() {
    if (mFlashIsOn) {
        mFab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(android.support.v4.content.ContextCompat.getColor(this, R.color.primary)));
        changeFabIcon();
    }else
        if ((mCurrentFragmentId) != (-1)) {
            mFab.hide();
        }
    
}