private void removeItemForDeletion(java.lang.String id) {
    for (int i = 0; i < (mItemsForDeletion.size()); i++) {
        if (mItemsForDeletion.get(i).equals(id)) {
            mItemsForDeletion.remove(i);
        }
    }
}