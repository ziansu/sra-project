public void updateSize(int updatedWidth) {
    if ((chart) == null) {
        return ;
    }
    defaultImgURL = saveToFile(chart, updatedWidth, height);
    this.setWidth((updatedWidth + "px"));
    this.chartLayout.setWidth((updatedWidth + "px"));
    width = updatedWidth;
    this.redrawChart();
}