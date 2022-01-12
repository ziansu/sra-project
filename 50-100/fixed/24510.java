@java.lang.Override
public int getItemViewType(int position) {
    if ((getItemSpanSizeForGrid(0, 0, 1)) == (-1)) {
        mDisableLoadMore = true;
        return getViewType(position);
    }
    return position == (getCount()) ? 65535 : getViewType(position);
}