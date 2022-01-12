public static void updateToolTip() {
    for (int i = 1; i <= (photoAlbum.MainFrame.photos.size()); i++) {
        photoAlbum.MainFrame.label[i].setToolTipText(("" + (photoAlbum.MainFrame.photos.get((i - 1)).annotation)));
    }
    for (int i = (photoAlbum.MainFrame.photos.size()) + 1; i <= 10; i++) {
        photoAlbum.MainFrame.label[i].setToolTipText("");
    }
}