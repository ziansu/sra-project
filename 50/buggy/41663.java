public void addItem(int position) {
    items.add(new com.kimjunhong.bucketlist.item.BucketItem("New Title", "New Date"));
    notifyItemInserted(items.size());
}