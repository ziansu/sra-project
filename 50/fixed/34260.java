@java.lang.Override
public int getSpanSize(int position) {
    return (adapter.getItemViewType(position)) == (nammari.network.ui.EndlessMultiStateAbsListFragment.NetworkWrapperAdapter.VIEW_TYPE_LOADING) ? getGridSpan() : 1;
}