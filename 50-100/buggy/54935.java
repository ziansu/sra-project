public void updateSize(int updatedWidth) {
    defaultImgURL = saveToFile(chart, updatedWidth, height);
    this.setWidth((updatedWidth + "px"));
    this.chartLayout.setWidth((updatedWidth + "px"));
    width = updatedWidth;
    this.redrawChart();
}