private java.util.List<com.emc.vipr.model.catalog.AssetOption> getContinuousCopyOptionsForProject(com.emc.sa.asset.AssetOptionsContext ctx, java.net.URI project, java.net.URI volumeId, com.emc.vipr.client.core.filters.ResourceFilter<com.emc.storageos.model.block.BlockMirrorRestRep> filter) {
    com.emc.vipr.client.ViPRCoreClient client = api(ctx);
    java.util.List<com.emc.storageos.model.block.BlockMirrorRestRep> copies = client.blockVolumes().getContinuousCopies(volumeId, filter);
    return constructCopiesOptions(client, project, copies);
}