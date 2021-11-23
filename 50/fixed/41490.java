@java.lang.Override
public void onAllDataRemoved(int itemCount) {
    mAdapter.notifyItemRangeRemoved(0, itemCount);
}