@java.lang.Override
public void onItemRangeRemoved(int positionStart, int itemCount) {
    mWrapAdapter.getAdapter().notifyItemRangeRemoved(positionStart, itemCount);
}