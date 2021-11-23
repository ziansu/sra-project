public void expandItem(int position, com.jiebademo.MainAdapter.ViewHolder viewHolder) {
    if (((currentExpandedItem) != (com.jiebademo.MainAdapter.NONE)) && ((currentExpandedViewHolder) != null)) {
        collapseItem(currentExpandedViewHolder);
    }
    currentExpandedItem = position;
    currentExpandedViewHolder = viewHolder;
    expandView(viewHolder, true);
}