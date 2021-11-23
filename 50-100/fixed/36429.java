@com.emc.sa.asset.annotation.Asset(value = "exportedIngestionMethod")
@com.emc.sa.asset.annotation.AssetDependencies(value = { "unmanagedBlockVirtualPool" })
public java.util.List<com.emc.vipr.model.catalog.AssetOption> getExportedIngestionMethod(com.emc.sa.asset.AssetOptionsContext ctx, java.net.URI virtualPoolId) {
    com.emc.vipr.client.ViPRCoreClient client = api(ctx);
    com.emc.storageos.model.vpool.BlockVirtualPoolRestRep virtualPoolRestRep = client.blockVpools().get(virtualPoolId);
    java.util.List<com.emc.vipr.model.catalog.AssetOption> options = com.google.common.collect.Lists.newArrayList();
    options.add(newAssetOption(IngestionMethodEnum.FULL.toString(), "unmanagedVolume.ingestMethod.full"));
    if ((virtualPoolRestRep.getHighAvailability()) != null) {
        options.add(newAssetOption(IngestionMethodEnum.VIRTUAL_VOLUMES_ONLY.toString(), "unmanagedVolume.ingestMethod.virtualVolumesOnly"));
    }
    return options;
}