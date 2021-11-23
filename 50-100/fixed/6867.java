public void loadImages(java.util.List<com.albums.model.Album> albums) {
    if ((albums != null) && ((albums.size()) > 0)) {
        waitMb.show(baseAlbumActivity);
        this.unprocessedAlbums = new java.util.ArrayList<com.albums.model.Album>(albums);
        for (int i = 0; i < (albums.size()); i++) {
            com.albums.util.ImageLoader imageLoader = new com.albums.util.ImageLoader(baseAlbumActivity, this);
            imageLoader.execute(albums.get(i));
        }
    }
}