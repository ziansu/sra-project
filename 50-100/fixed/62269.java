private void remove(int position) {
    com.exemple.android.cookbook.entity.CategoryRecipes data = mItems.get(position);
    if (mItemsPendingRemoval.contains(data)) {
        mItemsPendingRemoval.remove(data);
    }
    if (mItems.contains(data)) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }
}