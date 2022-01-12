public void updateView() {
    this.setLocation(parent.convertToScreenLocation(this.originLocation).toPoint());
    double scaleFactor = this.parent.getScaleFactor();
    this.setSize(((int) ((this.originDimension.width) * scaleFactor)), ((int) ((this.originDimension.height) * scaleFactor)));
    this.contentPane.updateView();
}