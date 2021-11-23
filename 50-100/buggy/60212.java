public static void updateToolTip() {
    for (int i = 1; i <= 10; i++) {
        if (i <= (photoAlbum.MainFrame.photos.size()))
            photoAlbum.MainFrame.label[i].setToolTipText(("" + (photoAlbum.MainFrame.photos.get((i - 1)).annotation)));
        
    }
}