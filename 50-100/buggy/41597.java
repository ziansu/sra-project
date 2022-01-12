@java.lang.Override
public void callback(org.geogebra.common.kernel.geos.GeoElement newGeo) {
    app.getKernel().clearJustCreatedGeosInViews();
    if (newGeo != null) {
        app.doAfterRedefine(newGeo);
        setGeoElement(newGeo);
        oldString = input;
    }
    callback.callback((newGeo != null));
}