void updateFromPreferences(android.content.SharedPreferences prefs) {
    int prefNumColumns = prefs.getInt(LauncherPreferences.KEY_WORKSPACE_COLS, 0);
    if (prefNumColumns > 0) {
        numColumns = prefNumColumns;
    }
    int prefNumRows = prefs.getInt(LauncherPreferences.KEY_WORKSPACE_ROWS, 0);
    if (prefNumRows > 0) {
        numRows = prefNumRows;
    }
    boolean showSearchBar = prefs.getBoolean(LauncherPreferences.KEY_SHOW_SEARCHBAR, true);
    if (showSearchBar) {
        searchBarSpaceHeightPx = (searchBarHeightPx) + (2 * (edgeMarginPx));
    }else {
        searchBarSpaceHeightPx = 1 * (edgeMarginPx);
    }
}