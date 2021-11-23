@java.lang.Override
public synchronized void run() {
    if (!(isAdded())) {
        return ;
    }
    if ((mLoading) != null) {
        mLoading.setVisibility(View.INVISIBLE);
    }
    mAdapter.updateDataSet(mItemList);
}