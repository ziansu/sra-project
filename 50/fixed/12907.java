public void onClick(android.content.DialogInterface dialog, int id) {
    int index = model.removeGroceryItem(groceryId);
    if (index >= 0) {
        adapter.notifyItemRemoved(index);
    }
}