private void handleDefaultCategoryChange(int position) {
    int defaultIndex = 0;
    if (position > 0) {
        defaultIndex = (AppConstants.Integers.DEFAULT_MENU_ITEM_COUNT) + (position - 1);
    }
    settingsManager.setDefaultCategoryIndex(defaultIndex);
}