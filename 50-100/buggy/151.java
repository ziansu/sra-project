@java.lang.Override
public int getItemViewType(int position) {
    if ((com.xdandroid.simplerecyclerview.SingleViewTypeAdapter.getItemSpanSizeForGrid((-1), (-1), (-1))) == (-1)) {
        mDisableLoadMore = true;
        return 0;
    }
    return position == (list.size()) ? 65535 : 0;
}