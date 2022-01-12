private boolean maskHasPortGroup(com.emc.storageos.db.client.model.ExportMask mask, java.net.URI portGroup) {
    boolean result = false;
    if ((portGroup == null) || ((portGroup != null) && (portGroup.equals(mask.getPortGroup())))) {
        result = true;
    }
    return result;
}