@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (!(state instanceof com.duolingo.open.rtlviewpager.RtlViewPager.SavedState)) {
        super.onRestoreInstanceState(state);
        return ;
    }
    com.duolingo.open.rtlviewpager.RtlViewPager.SavedState ss = ((com.duolingo.open.rtlviewpager.RtlViewPager.SavedState) (state));
    mLayoutDirection = ss.mLayoutDirection;
    super.onRestoreInstanceState(ss.mViewPagerSavedState);
}