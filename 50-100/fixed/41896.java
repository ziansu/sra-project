private android.view.View findLastFocusedViewById(@android.support.annotation.NonNull
android.support.v7.widget.RecyclerView rv, long id) {
    android.support.v7.widget.RecyclerView.Adapter adapter = rv.getAdapter();
    if (((adapter != null) && (adapter.hasStableIds())) && ((mLastSelectedId) != (android.support.v7.widget.RecyclerView.NO_ID))) {
        android.support.v7.widget.RecyclerView.ViewHolder viewHolder = rv.findViewHolderForItemId(id);
        if (viewHolder != null) {
            return viewHolder.itemView;
        }
    }
    return null;
}