@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    final E item = itemList.get(position);
    if (itemPendingRemovalList.contains(item)) {
        onSwipedLeft(((V) (holder)), position, item);
    }else {
        onNormal(((V) (holder)), position, item);
    }
}