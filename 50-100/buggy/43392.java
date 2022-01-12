public int mouseToItemIndex(int mouseY) {
    if (mouseY < ((dropbox_y) + (dropbox_rowheight))) {
        return -1;
    }
    if (mouseY >= (((dropbox_y) + (dropbox_height)) + (dropbox_rowheight))) {
        return -1;
    }
    mouseY -= dropbox_y;
    mouseY -= dropbox_rowheight;
    return mouseY / (dropbox_rowheight);
}