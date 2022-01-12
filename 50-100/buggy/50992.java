public static void releaseAllHolder(android.support.v7.widget.RecyclerView recyclerView) {
    for (int i = (recyclerView.getChildCount()) - 1; i >= 0; i--) {
        final android.view.View view = recyclerView.getChildAt(i);
        android.support.v7.widget.RecyclerView.ViewHolder viewHolder = recyclerView.getChildViewHolder(view);
        if ((viewHolder != null) && (viewHolder instanceof com.jess.arms.base.BaseHolder)) {
            ((com.jess.arms.base.BaseHolder) (viewHolder)).onRelease();
        }
    }
}