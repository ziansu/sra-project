public void setLogoView(com.android.internal.navigation.fling.FlingLogoView view) {
    mLogoView = view;
    if ((mLogoColor) != (view.getLogoColor())) {
        mLogoView.setLogoColor(mLogoColor);
    }
    animateToCurrentState();
}