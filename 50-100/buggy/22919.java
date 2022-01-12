@java.lang.Override
protected final GridLayoutManager.SpanSizeLookup getSpanSizeLookup() {
    return new android.support.v7.widget.GridLayoutManager.SpanSizeLookup() {
        @java.lang.Override
        public int getSpanSize(int position) {
            return supportEndless() ? getGridSpan() : (adapter.getItemViewType(position)) == (nammari.network.ui.EndlessMultiStateAbsListFragment.NetworkWrapperAdapter.VIEW_TYPE_LOADING) ? getGridSpan() : 1;
        }
    };
}