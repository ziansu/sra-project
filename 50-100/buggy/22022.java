@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (nammari.network.ui.EndlessMultiStateAbsListFragment.NetworkWrapperAdapter.VIEW_TYPE_LOADING)) {
        return new nammari.network.ui.EndlessMultiStateAbsListFragment.ListLoadingViewHolder(inflater.inflate(((getAdapterErrorLoadingErrorViewId()) == 0 ? R.layout.nammarinetwork__list_endless_loading_view : getAdapterErrorLoadingErrorViewId()), parent, false));
    }else {
        return mainAdapter.onCreateViewHolder(parent, (viewType - 1));
    }
}