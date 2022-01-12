@java.lang.Override
public int getItemViewType(int position) {
    if ((position > 0) && (position == (getLoadMoreViewPosition()))) {
        return com.github.xch168.quickrecycleradapter.BaseQuickAdapter.TYPE_LOAD_MORE_VIEW;
    }
    return super.getItemViewType(position);
}