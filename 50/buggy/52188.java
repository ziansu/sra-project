public boolean isSwitcherButtonEnabled() {
    return mIsInLandscapeMode ? ((mSwitcherButtonDP.getVisibility()) == (android.view.View.VISIBLE)) || ((mSwitcherButtonTP.getVisibility()) == (android.view.View.VISIBLE)) : mPortraitButtonHandler.isSwitcherButtonEnabled();
}