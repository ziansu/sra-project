@java.lang.Override
protected final GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
    if (!(supportEndless())) {
        return super.getSpanSizeLookup();
    }
    return new android.support.v7.widget.GridLayoutManager.SpanSizeLookup() {
        @java.lang.Override
        public int getSpanSize(int position) {
            return (adapter.getItemViewType(position)) == (nammari.network.ui.EndlessMultiStateAbsListFragment.NetworkWrapperAdapter.VIEW_TYPE_LOADING) ? getGridSpan() : 1;
        }
    };
}