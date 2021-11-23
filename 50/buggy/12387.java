@java.lang.Override
public int getItemViewType(int position) {
    return ((mBottomCount) != 0) && (position >= (getContentItemCount())) ? org.lvu.adapters.BaseListAdapter.ITEM_TYPE_BOTTOM : org.lvu.adapters.BaseListAdapter.ITEM_TYPE_CONTENT;
}