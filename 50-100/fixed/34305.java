public void setRegressionGeo() {
    if ((geoRegression) != null) {
        geoRegression.remove();
    }
    geoRegression = ((geogebra.kernel.GeoElement) (statGeo.createRegressionPlot(dataSelected, sd.getRegressionMode(), sd.getRegressionOrder(), false)));
    updateAllStatPanels(true);
}