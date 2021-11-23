@java.lang.Override
public void onDataInserted(int positionStart, int itemCount) {
    mAdapter.notifyItemRangeInserted(positionStart, itemCount);
}