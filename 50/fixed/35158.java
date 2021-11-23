@java.lang.Override
protected java.util.ArrayList<com.example.leslie.photogallery.GalleryItem> doInBackground(java.lang.Void... voids) {
    return new com.example.leslie.photogallery.FlickrFetchr().fetchItems();
}