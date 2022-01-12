public int mouseToItemIndex(int mouseY) {
    if (mouseY < (dropbox_y)) {
        return -1;
    }
    if (mouseY >= ((dropbox_y) + (dropbox_height))) {
        return -1;
    }
    mouseY -= dropbox_y;
    return mouseY / (dropbox_rowheight);
}