private java.lang.Class<? extends com.emc.storageos.api.service.authorization.DataObject> getBlockServiceResourceClass(java.lang.String uriStr) {
    java.lang.Class<? extends com.emc.storageos.api.service.authorization.DataObject> blockResourceClass = com.emc.storageos.api.service.authorization.Volume.class;
    if (com.emc.storageos.db.client.URIUtil.isType(java.net.URI.create(uriStr), com.emc.storageos.api.service.authorization.BlockMirror.class)) {
        blockResourceClass = com.emc.storageos.api.service.authorization.BlockMirror.class;
    }
    if (com.emc.storageos.db.client.URIUtil.isType(java.net.URI.create(uriStr), com.emc.storageos.api.service.authorization.VplexMirror.class)) {
        blockResourceClass = com.emc.storageos.api.service.authorization.VplexMirror.class;
    }
    return blockResourceClass;
}