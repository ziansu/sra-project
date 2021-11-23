private void fillListView(@android.support.annotation.NonNull
java.io.File file) {
    listAdapter_ = new com.kleshchin.danil.filemanager.ListAdapter(file);
    java.lang.String path = file.getPath();
    listView_.setAdapter(listAdapter_);
    com.kleshchin.danil.filemanager.ListViewFragment.OnToolbarTextChangeListener listener = ((com.kleshchin.danil.filemanager.ListViewFragment.OnToolbarTextChangeListener) (currentActivity_));
    listener.onToolbarTextChangeListener((path.equals(com.kleshchin.danil.filemanager.ListViewFragment.MAIN_PATH) ? getResources().getString(R.string.root_directory) : path), file);
}