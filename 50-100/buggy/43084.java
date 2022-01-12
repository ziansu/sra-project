public void loadFromGlobalSettingsValue(java.lang.String value) {
    bookmarkedSatIds.clear();
    if (value == null) {
        return ;
    }
    final java.lang.String[] satIDs = value.split(";");
    for (java.lang.String satId : satIDs) {
        bookmarkedSatIds.add(satId);
    }
}