public void edit(int position, com.saltycode.android.material2.material_playground.model.FeedItem item) {
    mItems.set(position, item);
    notifyItemChanged(position);
}