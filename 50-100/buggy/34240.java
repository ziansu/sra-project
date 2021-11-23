private void updateEmptyContentContainerVisibility(android.support.v7.widget.RecyclerView.Adapter adapter) {
    if (((emptyViewId) == 0) && ((providedEmptyView) == null)) {
        return ;
    }
    android.view.View emptyView = ((emptyContentContainer) != null) ? emptyContentContainer : providedEmptyView;
    emptyView.setVisibility(((adapter.getItemCount()) == 0 ? android.view.View.VISIBLE : android.view.View.GONE));
}