private void refreshAlbumListView() {
    java.util.Collection<com.secretproject.photoprogress.data.PhotoAlbum> albums = com.secretproject.photoprogress.helpers.PhotoAlbumHelper.getAllPhotoAlbums();
    if (albums != null) {
        albumAdapter.clear();
        albumAdapter.addAll(albums);
        albumAdapter.notifyDataSetChanged();
    }
}