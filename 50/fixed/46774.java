protected void setImage_(final java.io.File imageFile) {
    this.imageFile = imageFile;
    if ((peer) != null) {
        ((dorkbox.systemTray.peer.MenuItemPeer) (peer)).setImage(this);
    }
}