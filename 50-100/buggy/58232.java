@java.lang.Override
public void onHide() {
    if (deleteItem[0]) {
        com.app.afridge.dom.HistoryItem historyItem = new com.app.afridge.dom.HistoryItem(item, ((java.util.Calendar.getInstance().getTimeInMillis()) / 1000), com.app.afridge.dom.enums.ChangeType.DELETE);
        historyItem.save();
        item.setRemoved(true);
        item.setEditTimestamp(java.util.Calendar.getInstance().getTimeInMillis());
        item.save();
        items.remove(item);
        filteredItems.remove(item);
        notifyDataSetChanged();
    }
}