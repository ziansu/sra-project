private void doTestImage1(java.lang.String name) {
    try {
        org.geotools.gce.imagemosaic.jdbc.AbstractTest.ENV_1.setCoordinateReferenceSystem(org.geotools.referencing.CRS.decode(org.geotools.gce.imagemosaic.jdbc.AbstractTest.CRSNAME));
        imageMosaic(name, getConfigUrl(), org.geotools.gce.imagemosaic.jdbc.AbstractTest.ENV_1, 500, 250, true);
    } catch (java.lang.Exception e) {
        junit.framework.Assert.fail(e.getMessage());
    }
}