protected void runScriptsIfNeeded(geogebra.common.kernel.geos.GeoElement geo1) {
    if (((view.getHits().size()) > 0) && ((view.getHits().get(0)) instanceof geogebra.common.kernel.geos.GeoTextField)) {
        view.requestFocusInWindow();
    }
    if (!(scriptsHaveRun)) {
        scriptsHaveRun = true;
        app.runScripts(geo1, ((java.lang.String) (null)));
    }
}