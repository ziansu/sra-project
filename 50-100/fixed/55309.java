public static com.vividsolutions.jts.geom.MultiPolygon getStakeholderLands(final java.lang.Integer connectionID, final java.lang.Integer stakeholderID) {
    com.vividsolutions.jts.geom.MultiPolygon result = nl.tytech.util.JTSUtils.EMPTY;
    final nl.tytech.core.structure.ItemMap<nl.tytech.data.engine.item.Land> lands = nl.tytech.core.client.event.EventManager.getItemMap(connectionID, MapLink.LANDS);
    for (nl.tytech.data.engine.item.Land land : lands) {
        if (land.getOwnerID().equals(stakeholderID)) {
            result = nl.tytech.util.JTSUtils.union(result, land.getMultiPolygon());
        }
    }
    return result;
}