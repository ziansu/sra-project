@java.lang.Override
protected void onPageMoved(int position, float fraction) {
    super.onPageMoved(position, fraction);
    if (!(mSearchMode)) {
        float openFraction = (1 - position) - fraction;
        android.support.v4.view.ViewCompat.setScaleX(mCreateFab, openFraction);
        android.support.v4.view.ViewCompat.setScaleY(mCreateFab, openFraction);
        mCreateFab.setVisibility((openFraction == 0 ? android.view.View.INVISIBLE : android.view.View.VISIBLE));
    }
}