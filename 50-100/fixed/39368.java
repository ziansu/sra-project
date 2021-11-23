@java.lang.Override
public com.netflix.config.PollResult poll(final boolean initial, final java.lang.Object checkPoint) {
    final java.util.Map<java.lang.String, java.lang.Object> config = com.google.common.collect.Maps.newHashMap();
    for (final java.lang.String path : getPaths()) {
        final com.nike.vault.client.model.VaultResponse vaultResponse = getVaultClient().read(path);
        config.putAll(vaultResponse.getData());
    }
    return com.netflix.config.PollResult.createFull(config);
}