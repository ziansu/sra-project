@java.lang.Override
public int getItemCount() {
    if ((com.xdandroid.simplerecyclerview.SingleViewTypeAdapter.getItemSpanSizeForGrid(0, 0, 1)) == (-1)) {
        mDisableLoadMore = true;
        return (list) == null ? 0 : list.size();
    }
    return (list) == null ? 0 : (list.size()) + 1;
}