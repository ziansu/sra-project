public void addItemRange(java.util.List<com.trebuh.clarity.models.Photo> photos) {
    int currentSize = getItemCount();
    photoList.addAll(photos);
    notifyItemRangeInserted(currentSize, photos.size());
}