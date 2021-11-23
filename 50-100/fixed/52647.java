private void fromSearchToNormal() {
    setLogoTextInt("");
    setSearchString("", true);
    setCurrentState(org.cryse.widget.persistentsearch.PersistentSearchView.SearchViewState.NORMAL);
    if ((mDisplayMode) == (org.cryse.widget.persistentsearch.PersistentSearchView.DisplayMode.TOOLBAR)) {
        closeSearchInternal();
    }else
        if ((mDisplayMode) == (org.cryse.widget.persistentsearch.PersistentSearchView.DisplayMode.MENUITEM)) {
            hideCircularlyToMenuItem();
        }
    
    setLogoTextInt("");
    if ((mSearchListener) != null)
        mSearchListener.onSearchExit();
    
    mHomeButton.animateState(mHomeButtonCloseIconState);
}