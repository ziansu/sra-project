protected void bind() {
    presenter = new cn.jack.album.AlbumPresenter(this);
    albumGridAdapter = new cn.jack.album.AlbumGridAdapter(this, presenter.getPhotos(), maxChoice);
    albumListAdapter = new cn.jack.album.AlbumListAdapter(this, presenter.getAlbums(), listClickListener);
    albumGridRecyclerView.setAdapter(albumGridAdapter);
    albumListRecyclerView.setAdapter(albumListAdapter);
    presenter.loadAlbumPhotos(AlbumMediaScanner.ALBUM_ID_ALL_PHOTOS);
    presenter.loadAlbumList();
}