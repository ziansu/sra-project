@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (isCheckMode()) {
        mImageAdapter.checkId(id);
    }
    if ((mCheckListener) != null) {
        mCheckListener.onCheckStateChanged(mImageAdapter.getCheckedImageList().size());
    }
}