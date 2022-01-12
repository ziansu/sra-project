private void writeChannels(final java.util.List<org.eclipse.kura.asset.AssetRecord> assetRecordsToWriteChannels) {
    java.util.Objects.requireNonNull(assetRecordsToWriteChannels, org.eclipse.kura.internal.wire.asset.WireAsset.message.assetRecordsNonNull());
    if (assetRecordsToWriteChannels.isEmpty()) {
        return ;
    }
    try {
        write(assetRecordsToWriteChannels);
    } catch (final org.eclipse.kura.KuraException e) {
        org.eclipse.kura.internal.wire.asset.WireAsset.logger.error(org.eclipse.kura.internal.wire.asset.WireAsset.message.errorPerformingWrite(), e);
    }
}