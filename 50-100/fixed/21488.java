public void setKeyword(java.lang.String keyword, int backgroundColor) {
    this.keyword = keyword;
    int nextViewIndex = ((currentViewIndex) + 1) % (DEFAULT_VIEW_BUFFER_SIZE);
    android.view.View currentView = keywordCardViews.get(currentViewIndex);
    android.view.View nextView = keywordCardViews.get(nextViewIndex);
    keywordTypeEditTexts.get(nextViewIndex).setText("");
    backgroundLinearLayouts.get(nextViewIndex).setBackgroundColor(backgroundColor);
    transition(currentView, nextView);
}