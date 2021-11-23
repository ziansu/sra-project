public void unselectActiveItem() {
    if ((activeItem) != null) {
        activeItem.getController().stopEdit();
        unselect(activeItem.getGeo());
    }
    repaintView();
}