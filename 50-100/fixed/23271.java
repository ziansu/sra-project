@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    java.lang.Long itemId = ((java.lang.Long) (viewHolder.itemView.getTag()));
    if (isChecked) {
        if (!(itemsToDelete.contains(itemId))) {
            itemsToDelete.add(itemId);
        }
    }else {
        if (itemsToDelete.contains(itemId)) {
            itemsToDelete.remove(itemId);
        }
    }
}