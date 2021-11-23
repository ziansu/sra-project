void sliderValueChanged() {
    int value = slider.getValue().intValue();
    if (colorsEnabled) {
        getPenGeo().setLineThickness(value);
    }else {
        app.getActiveEuclidianView().getSettings().setDeleteToolSize(value);
    }
}