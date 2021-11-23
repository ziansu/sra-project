@java.lang.Override
public void onRefresh() {
    if ((mGetPhotoTask) != null) {
        mGetPhotoTask.isCancelled();
    }
    mPhotoList.clear();
    mAdapter.notifyDataSetChanged();
    createGetPhotoTask();
}