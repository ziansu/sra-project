@java.lang.Override
public final void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int position) {
    if (viewHolder instanceof com.pierfrancescosoffritti.shrinkingimagelayout.HeaderRecyclerViewAdapter.HeaderViewHolder)
        return ;
    
    onBindViewHolder_(((VH) (viewHolder)), (position - 1));
}