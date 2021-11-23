public void setImage(final model.TextureImage image) {
    model.TextureImage oldvalue = this.textureImage;
    this.textureImage = image;
    setOpened(true);
    setFile(image.getFile());
    getInfoPanel().setTextureFile(image);
    this.canvasPanel.updateNumMipMaps();
    firePropertyChange("textureImage", oldvalue, this.textureImage);
}