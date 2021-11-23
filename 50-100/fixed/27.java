@java.lang.Override
public com.datavenia.pathfinderpanacea.fragments.DashboardFragment.DragDropWidgetAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = null;
    for (com.datavenia.pathfinderpanacea.widgets.DashboardWidget widget : mItemList) {
        if ((widget.getViewId()) == viewType) {
            view = widget.getView();
            break;
        }
    }
    return new com.datavenia.pathfinderpanacea.fragments.DashboardFragment.DragDropWidgetAdapter.ViewHolder(view);
}