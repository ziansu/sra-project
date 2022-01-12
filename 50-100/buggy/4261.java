public void addNewAlbum() {
    java.lang.String name = view.promptForAlbumName();
    if ((name == null) || (name.equals("")))
        return ;
    
    Album newAlbum = new Album(name);
    Album selectedAlbum = view.getSelectedAlbum();
    if (selectedAlbum != null) {
        selectedAlbum.addSubAlbum(newAlbum);
    }else {
        root.addSubAlbum(newAlbum);
    }
    view.onAlbumAdded(newAlbum);
}