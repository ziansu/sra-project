private void removeItemForDeletion(com.example.nihadhrnjic.spendingstracker.models.SpendingsItem item) {
    for (int i = 0; i < (mItemsForDeletion.size()); i++) {
        if (mItemsForDeletion.get(i).equals(item)) {
            mItemsForDeletion.remove(i);
        }
    }
}