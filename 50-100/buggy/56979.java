protected java.util.List<com.emc.vipr.model.catalog.AssetOption> constructCopiesOptions(com.emc.vipr.client.ViPRCoreClient client, java.net.URI project, java.util.List<com.emc.storageos.model.block.BlockMirrorRestRep> copies) {
    java.util.List<com.emc.vipr.model.catalog.AssetOption> options = com.google.common.collect.Lists.newArrayList();
    java.util.Map<java.net.URI, com.emc.storageos.model.block.VolumeRestRep> volumeNames = com.emc.sa.asset.providers.BlockProvider.getProjectVolumeNames(client, project);
    for (com.emc.storageos.model.block.BlockMirrorRestRep copy : copies) {
        options.add(new com.emc.vipr.model.catalog.AssetOption(copy.getId(), com.emc.sa.asset.providers.BlockProvider.getBlockObjectLabel(client, copy, volumeNames)));
    }
    com.emc.sa.asset.AssetOptionsUtils.sortOptionsByLabel(options);
    return options;
}