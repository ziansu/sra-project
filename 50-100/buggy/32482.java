private static void initializegvSIGDrivers() throws java.lang.Exception {
    final java.lang.String fwAndamiDriverPath = "../_fwAndami/gvSIG/extensiones/com.iver.cit.gvsig/drivers";
    final java.io.File baseDriversPath = new java.io.File(fwAndamiDriverPath);
    if (!(baseDriversPath.exists())) {
        throw new java.lang.Exception(("Can't find drivers path: " + fwAndamiDriverPath));
    }
    com.iver.cit.gvsig.fmap.layers.LayerFactory.setDriversPath(baseDriversPath.getAbsolutePath());
    if ((com.iver.cit.gvsig.fmap.layers.LayerFactory.getDM().getDriverNames().length) < 1) {
        throw new java.lang.Exception(("Can't find drivers in path: " + fwAndamiDriverPath));
    }
}