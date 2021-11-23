@java.lang.Override
public void onRefresh() {
    if ((mGetPhotoTask) != null) {
        mGetPhotoTask.isCancelled();
    }
    mGetPhotoTask = null;
    mPhotoList.clear();
    mAdapter.notifyDataSetChanged();
    createGetPhotoTask();
}