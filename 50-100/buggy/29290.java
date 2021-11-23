public void onClick(android.content.DialogInterface dialog, int id) {
    int position = getAdapterPosition();
    int minusPoint = allItems.get(position).getPoints();
    java.lang.String itemName = (allItems.get(position).getName()) + ".jpg";
    deleteItemFromDatabase(position);
    deleteItemFromStorage(itemName);
    deleteItemFromRecyclerView(position);
    updatePoint(minusPoint);
}