private void setViewType2D() {
    viewType2DMenuItem.setState(true);
    viewTypeFlatMenuItem.setState(false);
    if (helixImgGen.setImageType(HelixImageGenerator.VIEW_2D)) {
        this.updateImage();
    }
}