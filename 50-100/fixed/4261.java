public void addNewAlbum() {
    java.lang.String name = view.promptForAlbumName();
    if ((name == null) || (name.trim().isEmpty()))
        return ;
    
    Album newAlbum = new Album(name);
    Album selectedAlbum = view.getSelectedAlbum();
    if (selectedAlbum != null) {
        if (selectedAlbum.addSubAlbum(newAlbum))
            view.onAlbumAdded(newAlbum);
        
    }else {
        if (root.addSubAlbum(newAlbum))
            view.onAlbumAdded(newAlbum);
        
    }
}