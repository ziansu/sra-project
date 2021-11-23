@java.lang.Override
public synchronized void run() {
    if (!(fragment.isAdded())) {
        return ;
    }
    if ((fragment.mLoading) != null) {
        fragment.mLoading.setVisibility(View.INVISIBLE);
    }
    adapter.updateDataSet(fragment.mItemList);
}