void sliderValueChanged(double value) {
    if (colorsEnabled) {
        getPenGeo().setLineThickness(((int) (value)));
    }else {
        app.getActiveEuclidianView().getSettings().setDeleteToolSize(((int) (value)));
    }
}