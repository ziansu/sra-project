private void setViewTypeFlat() {
    viewType2DMenuItem.setState(false);
    viewTypeFlatMenuItem.setState(true);
    if (helixImgGen.setImageType(HelixImageGenerator.VIEW_FLAT)) {
        this.updateImage();
    }
}