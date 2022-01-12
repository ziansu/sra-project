protected ch.cyberduck.core.vault.Vault find(final ch.cyberduck.core.Path directory, final ch.cyberduck.core.vault.LoadingVaultLookupListener listener) throws ch.cyberduck.core.vault.VaultUnlockCancelException {
    final ch.cyberduck.core.vault.Vault vault = ch.cyberduck.core.vault.VaultFactory.get(directory.attributes().getVault(), keychain);
    listener.found(vault);
    return vault;
}