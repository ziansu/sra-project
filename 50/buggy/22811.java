@java.lang.Override
public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
    mWrapAdapter.getAdapter().notifyItemMoved(fromPosition, toPosition);
}