public final void notifyAddAll(geogebra.common.kernel.View view, int consStep) {
    if (!(notifyViewsActive)) {
        return ;
    }
    for (geogebra.common.kernel.geos.GeoElement geo : cons.getGeoSetWithCasCellsConstructionOrder()) {
        if (!(geo.isAvailableAtConstructionStep(consStep))) {
            break;
        }
        view.add(geo);
    }
}