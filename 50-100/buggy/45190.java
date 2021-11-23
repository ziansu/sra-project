@java.lang.Override
protected void onPostExecute(java.util.List<com.bignerdranch.android.photogallery.GalleryItem> galleryItems) {
    if ((lastPageFetched) > 0) {
        mItems.addAll(galleryItems);
        mPhotoRecyclerView.getAdapter().notifyDataSetChanged();
    }else {
        mItems = galleryItems;
        setupAdapter();
    }
    (lastPageFetched)++;
}