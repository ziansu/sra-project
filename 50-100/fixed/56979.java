protected java.util.List<com.emc.vipr.model.catalog.AssetOption> constructCopiesOptions(com.emc.vipr.client.ViPRCoreClient client, java.net.URI project, java.util.List<com.emc.storageos.model.block.BlockMirrorRestRep> copies) {
    java.util.List<com.emc.vipr.model.catalog.AssetOption> options = com.google.common.collect.Lists.newArrayList();
    for (com.emc.storageos.model.block.BlockMirrorRestRep copy : copies) {
        options.add(new com.emc.vipr.model.catalog.AssetOption(copy.getId(), com.emc.sa.asset.providers.BlockProvider.getBlockObjectLabel(client, copy, null)));
    }
    com.emc.sa.asset.AssetOptionsUtils.sortOptionsByLabel(options);
    return options;
}