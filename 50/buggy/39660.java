private void handleDefaultCategoryChange(int position) {
    int defaultIndex = (AppConstants.Integers.DEFAULT_MENU_ITEM_COUNT) + position;
    settingsManager.setDefaultCategoryIndex(defaultIndex);
}