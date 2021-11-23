void setMirrorFileShareAttributes(com.emc.storageos.db.client.model.FileShare sourceFileShare, com.emc.storageos.db.client.model.FileShare targetFileShare) {
    if (sourceFileShare != null) {
        if ((sourceFileShare.getMirrorfsTargets()) == null) {
            sourceFileShare.setMirrorfsTargets(new com.emc.storageos.db.client.model.StringSet());
        }
        sourceFileShare.getMirrorfsTargets().add(targetFileShare.getId().toString());
        targetFileShare.setParentFileShare(new com.emc.storageos.db.client.model.NamedURI(sourceFileShare.getId(), sourceFileShare.getLabel()));
        _dbClient.updateObject(sourceFileShare);
        _dbClient.updateObject(targetFileShare);
    }
}