@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle state) {
    super.onRestoreInstanceState(state);
    selectedInstances = ((java.util.LinkedHashSet<java.lang.Long>) (state.getSerializable(org.odk.collect.android.activities.AppListActivity.SELECTED_INSTANCES)));
    isSearchBoxShown = state.getBoolean(org.odk.collect.android.activities.AppListActivity.IS_SEARCH_BOX_SHOWN);
    isBottomDialogShown = state.getBoolean(org.odk.collect.android.activities.AppListActivity.IS_BOTTOM_DIALOG_SHOWN);
    savedFilterText = state.getString(org.odk.collect.android.activities.AppListActivity.SEARCH_TEXT);
}