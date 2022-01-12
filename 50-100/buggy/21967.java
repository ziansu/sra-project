public void addNewAlbum() {
    Album newAlbum = new Album(view.promptForAlbumName());
    Album selectedAlbum = view.getSelectedAlbum();
    if (selectedAlbum != null) {
        selectedAlbum.addSubAlbum(newAlbum);
    }else {
        root.addSubAlbum(newAlbum);
    }
    view.onAlbumAdded(newAlbum);
}