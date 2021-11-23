private void fillListView(@android.support.annotation.NonNull
java.io.File file) {
    com.kleshchin.danil.filemanager.ListViewFragment.OnToolbarTextChangeListener listener = ((com.kleshchin.danil.filemanager.ListViewFragment.OnToolbarTextChangeListener) (currentActivity_));
    listAdapter_ = new com.kleshchin.danil.filemanager.ListAdapter(currentView_.getContext(), file);
    java.lang.String path = file.getPath();
    if (path.equals(com.kleshchin.danil.filemanager.ListViewFragment.MAIN_PATH)) {
        listener.onToolbarTextChangeListener(getResources().getString(R.string.root_directory), file);
    }else {
        listener.onToolbarTextChangeListener(path, file);
    }
    listView_.setAdapter(listAdapter_);
}