@java.lang.Override
public void onClick(android.view.View view) {
    johnsmith.haruhi.co.refrigerator.Model.Unit.Item item = itemList.get(position);
    if (itemList.contains(item)) {
        listener.onDeleteClick(item.getId());
        itemList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, itemList.size());
    }
}