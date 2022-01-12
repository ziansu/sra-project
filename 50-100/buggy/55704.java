void setMirrorFileShareAttributes(com.emc.storageos.db.client.model.FileShare sourceFileShare, com.emc.storageos.db.client.model.FileShare targetFileShare) {
    if (sourceFileShare != null) {
        if ((sourceFileShare.getMirrorfsTargets()) == null) {
            sourceFileShare.setMirrorfsTargets(new com.emc.storageos.db.client.model.StringSet());
        }else {
            sourceFileShare.getMirrorfsTargets().add(sourceFileShare.getId().toString());
        }
        targetFileShare.setParentFileShare(new com.emc.storageos.db.client.model.NamedURI(sourceFileShare.getId(), sourceFileShare.getLabel()));
    }
}