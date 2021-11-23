@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (holder instanceof org.fossasia.susi.ai.adapters.viewHolders.ChatViewHolder) {
        org.fossasia.susi.ai.adapters.viewHolders.ChatViewHolder chatViewHolder = ((org.fossasia.susi.ai.adapters.viewHolders.ChatViewHolder) (holder));
        handleItemEvents(chatViewHolder, position);
    }
    if (holder instanceof org.fossasia.susi.ai.adapters.viewHolders.MapViewHolder) {
        org.fossasia.susi.ai.adapters.viewHolders.MapViewHolder mapViewHolder = ((org.fossasia.susi.ai.adapters.viewHolders.MapViewHolder) (holder));
        handleItemEvents(mapViewHolder, position);
    }
    if ((highlightMessagePosition) == position) {
        holder.itemView.setBackgroundColor(android.graphics.Color.parseColor("#3e6182"));
    }else {
        holder.itemView.setBackgroundColor(Color.TRANSPARENT);
    }
}