public static void removeHeaderView(android.support.v7.widget.RecyclerView recyclerView) {
    android.support.v7.widget.RecyclerView.Adapter outerAdapter = recyclerView.getAdapter();
    if ((outerAdapter != null) && (outerAdapter instanceof com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter)) {
        int headerViewCounter = ((com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter) (outerAdapter)).getHeaderViewsCount();
        if (headerViewCounter > 0) {
            android.view.View headerView = ((com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter) (outerAdapter)).getHeaderView();
            ((com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter) (outerAdapter)).removeHeaderView(headerView);
        }
    }
}