public void setImage(java.awt.Image image) {
    _image = image.getScaledInstance(_width, _height, java.awt.Image.SCALE_SMOOTH);
    setOperation(models.TileModel.EVENT_IMAGE_CHANGED);
    doneUpdating();
}