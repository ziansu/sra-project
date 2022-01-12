@com.runwaysdk.dataaccess.transaction.Transaction
public static java.lang.String createGeoEntity(java.lang.String parentId, java.lang.String universalId, java.lang.String label) {
    com.runwaysdk.system.gis.geo.Universal universal = com.runwaysdk.system.gis.geo.Universal.get(universalId);
    com.runwaysdk.system.gis.geo.GeoEntity parent = com.runwaysdk.system.gis.geo.GeoEntity.get(parentId);
    com.runwaysdk.system.gis.geo.GeoEntity entity = new com.runwaysdk.system.gis.geo.GeoEntity();
    entity.setUniversal(universal);
    entity.setGeoId(net.geoprism.DataUploader.GENERATOR.generateKey(""));
    entity.getDisplayLabel().setDefaultValue(label);
    entity.apply();
    entity.addLink(parent, LocatedIn.CLASS);
    return entity.getId();
}