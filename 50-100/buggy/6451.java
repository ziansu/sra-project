@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.text.TextUtils.isEmpty(zipCodeACT.getText())) && (!(isUsingCurrentLocation))) {
        showInvalidEntriesDialog();
    }else {
        if (((prefZipCode) == null) || ((prefZipCode) == "")) {
            showSaveZipCodeEntryDialog(v);
        }else {
            startSearch(v);
        }
    }
}