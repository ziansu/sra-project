@java.lang.Override
protected void onPostExecute(de.k3b.database.SelectedItems selectedItems) {
    if (!(isCancelled())) {
        onMissingDisplayNamesComplete(mStatus);
    }
}