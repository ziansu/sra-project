public void updateFolder(com.mcnedward.museum.model.Directory folder) {
    this.folder = folder;
    updateText();
    setImage(folder.getThumbnail());
    folder.setFolderCard(this);
}