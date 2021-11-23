@java.lang.Override
public void initialize() throws org.openstreetmap.josm.plugins.ods.exceptions.OdsException {
    addFeatureDownloader(createBuildingDownloader("bag:pand"));
    addFeatureDownloader(createBuildingDownloader("bag:ligplaats"));
    addFeatureDownloader(createBuildingDownloader("bag:standplaats"));
    addFeatureDownloader(createVerblijfsobjectDownloader());
    this.primitiveBuilder = new org.openstreetmap.josm.plugins.ods.bag.BagPrimitiveBuilder(module);
}