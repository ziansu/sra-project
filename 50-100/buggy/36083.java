@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    net.nemanjakovacevic.recyclerviewswipetodelete.base.BaseRecycleViewSwiped.BaseViewHolder viewHolder = ((net.nemanjakovacevic.recyclerviewswipetodelete.base.BaseRecycleViewSwiped.BaseViewHolder) (holder));
    final E item = ((E) (itemList.get(position)));
    if (itemPendingRemovalList.contains(item)) {
        onSwipedLeft(((V) (viewHolder)), position, item);
    }else {
        onNormal(((V) (viewHolder)), position, item);
    }
}