private void doViennaEnv(java.lang.String name) {
    try {
        org.geotools.gce.imagemosaic.jdbc.AbstractTest.ENV_VIENNA2.setCoordinateReferenceSystem(org.geotools.referencing.CRS.decode(org.geotools.gce.imagemosaic.jdbc.AbstractTest.CRSNAME));
        imageMosaic(name, getConfigUrl(), org.geotools.gce.imagemosaic.jdbc.AbstractTest.ENV_VIENNA2, 500, 500);
    } catch (java.lang.Exception e) {
        junit.framework.Assert.fail(e.getMessage());
    }
}