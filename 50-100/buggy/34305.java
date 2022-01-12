public void setRegressionGeo() {
    if ((geoRegression) != null) {
        geoRegression.remove();
    }
    geoRegression = ((geogebra.kernel.GeoElement) (statGeo.createRegressionPlot(dataSelected, sd.getRegressionMode(), sd.getRegressionOrder(), false)));
    geoRegression.removeView(Application.VIEW_EUCLIDIAN);
    geoRegression.setAuxiliaryObject(true);
    app.getEuclidianView().remove(geoRegression);
    geoRegression.setLabel("regressionModel");
    updateAllStatPanels(true);
}