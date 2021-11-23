@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.clear_search)) {
        if ((com.example.downloaderdemo.fragment.DownloadFragment.sRecentSuggestions) != null) {
            com.example.downloaderdemo.fragment.DownloadFragment.ConfirmationDialogFragment dialog = new com.example.downloaderdemo.fragment.DownloadFragment.ConfirmationDialogFragment();
            dialog.show(getFragmentManager(), "Clear history");
        }else {
            com.example.downloaderdemo.util.Utils.showSnackbar(mView, "History clear");
        }
        return true;
    }
    return super.onOptionsItemSelected(item);
}