@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable(org.odk.collect.android.activities.AppListActivity.SELECTED_INSTANCES, selectedInstances);
    outState.putBoolean(org.odk.collect.android.activities.AppListActivity.IS_SEARCH_BOX_SHOWN, (!(searchView.isIconified())));
    outState.putBoolean(org.odk.collect.android.activities.AppListActivity.IS_BOTTOM_DIALOG_SHOWN, bottomSheetDialog.isShowing());
    outState.putString(org.odk.collect.android.activities.AppListActivity.SEARCH_TEXT, java.lang.String.valueOf(searchView.getQuery()));
    if (bottomSheetDialog.isShowing()) {
        bottomSheetDialog.dismiss();
    }
}