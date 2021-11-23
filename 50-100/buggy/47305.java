@java.lang.Override
public void initialize() throws org.openstreetmap.josm.plugins.ods.exceptions.OdsException {
    this.layerManager = module.getOpenDataLayerManager();
    addFeatureDownloader(createBuildingDownloader("bag:pand"));
    addFeatureDownloader(createBuildingDownloader("bag:ligplaats"));
    addFeatureDownloader(createBuildingDownloader("bag:standplaats"));
    addFeatureDownloader(createMissingAddressDownloader());
    addFeatureDownloader(createVerblijfsobjectDownloader());
    this.primitiveBuilder = new org.openstreetmap.josm.plugins.ods.bag.BagPrimitiveBuilder(module);
}