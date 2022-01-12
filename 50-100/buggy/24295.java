public static void setFooterViewState(android.support.v7.widget.RecyclerView recyclerView, com.lnyp.recyclerview.RecyclerViewLoadingFooter.State state) {
    android.support.v7.widget.RecyclerView.Adapter outerAdapter = recyclerView.getAdapter();
    if ((outerAdapter != null) && (outerAdapter instanceof com.lnyp.recyclerview.HeaderAndFooterRecyclerViewAdapter)) {
        if ((((com.lnyp.recyclerview.HeaderAndFooterRecyclerViewAdapter) (outerAdapter)).getFooterViewsCount()) > 0) {
            com.lnyp.recyclerview.RecyclerViewLoadingFooter footerView = ((com.lnyp.recyclerview.RecyclerViewLoadingFooter) (((com.lnyp.recyclerview.HeaderAndFooterRecyclerViewAdapter) (outerAdapter)).getFooterView()));
            footerView.setState(state);
        }
    }
}