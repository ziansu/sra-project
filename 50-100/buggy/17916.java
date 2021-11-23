public void layoutSubviews() {
    super.layoutSubviews();
    mocha.ui.Rect bounds = this.getBounds();
    mocha.ui.Rect contentRect = this.getContentRectForBounds(bounds);
    this.backgroundImageView.setFrame(this.getBackgroundRectForBounds(bounds));
    this.imageView.setFrame(this.getImageRectForContentRect(contentRect));
    this.titleLabel.setFrame(this.getTitleRectForContentRect(contentRect));
    MLog("Button title frame: %s", this.titleLabel.getFrame());
}