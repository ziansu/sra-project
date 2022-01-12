@java.lang.Override
protected java.util.List<com.example.miljanrakita.photogallery.Model.GalleryItem> doInBackground(java.lang.Integer... params) {
    return new com.example.miljanrakita.photogallery.Model.FlickrFetchr().fetchItems(params[0]);
}