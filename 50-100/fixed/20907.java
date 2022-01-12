@com.emc.sa.asset.annotation.Asset(value = "unexportedIngestionMethod")
@com.emc.sa.asset.annotation.AssetDependencies(value = { "unmanagedBlockStorageSystem" })
public java.util.List<com.emc.vipr.model.catalog.AssetOption> getUnexportedIngestionMethod(com.emc.sa.asset.AssetOptionsContext ctx, java.net.URI storageSystemId) {
    com.emc.vipr.client.ViPRCoreClient client = api(ctx);
    com.emc.storageos.model.systems.StorageSystemRestRep storageSystemRestRep = client.storageSystems().get(storageSystemId);
    java.util.List<com.emc.vipr.model.catalog.AssetOption> options = com.google.common.collect.Lists.newArrayList();
    options.add(newAssetOption(IngestionMethodEnum.FULL.toString(), "unmanagedVolume.ingestMethod.full"));
    if (com.emc.sa.asset.providers.BlockProviderUtils.isVplex(storageSystemRestRep)) {
        options.add(newAssetOption(IngestionMethodEnum.VIRTUAL_VOLUMES_ONLY.toString(), "unmanagedVolume.ingestMethod.virtualVolumesOnly"));
    }
    return options;
}