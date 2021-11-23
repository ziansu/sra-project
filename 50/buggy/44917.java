private void cancelBrowseToTask() {
    if ((browseToTask) != null) {
        android.util.Log.d(de.qabel.qabelbox.fragments.FilesFragment.TAG, "Found a running browseToTask");
        browseToTask.cancel(true);
        android.util.Log.d(de.qabel.qabelbox.fragments.FilesFragment.TAG, "Canceled browserToTask");
    }
}