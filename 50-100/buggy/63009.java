protected static com.emc.vipr.model.catalog.AssetOption createBucketOption(com.emc.vipr.client.ViPRCoreClient client, java.net.URI hostId, com.emc.storageos.model.DataObjectRestRep bucketObject, java.util.Map<java.net.URI, com.emc.storageos.model.object.BucketRestRep> bucketNames) {
    java.lang.String name = com.emc.sa.asset.providers.ObjectProvider.getBucketObjectLabel(client, bucketObject, bucketNames);
    java.lang.String hardQuota = com.emc.sa.asset.providers.ObjectProvider.getBucketObjectHardQuota(bucketObject);
    java.lang.String softQuota = com.emc.sa.asset.providers.ObjectProvider.getBucketObjectSoftQuota(bucketObject);
    java.lang.String retention = com.emc.sa.asset.providers.ObjectProvider.getBucketObjectRetention(bucketObject);
    java.lang.String label = getMessage("object.bucket.label", name, hardQuota, softQuota, retention);
    return new com.emc.vipr.model.catalog.AssetOption(bucketObject.getId(), label);
}