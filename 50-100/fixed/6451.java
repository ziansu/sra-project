@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.text.TextUtils.isEmpty(zipCodeACT.getText())) && (!(isUsingCurrentLocation))) {
        showInvalidEntriesDialog();
    }
    if (((prefZipCode) != null) && (!(isUsingCurrentLocation))) {
        showSaveZipCodeEntryDialog(v);
    }
    startSearch(v);
}