public void insert(int position, com.saltycode.android.material2.material_playground.model.FeedItem item) {
    mItems.add(position, item);
    notifyItemInserted(position);
}