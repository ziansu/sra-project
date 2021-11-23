private de.metas.hostkey.spi.IHostKeyStorage getHostKeyStorage() {
    org.adempiere.util.Check.assumeNotNull(_hostKeyStorage, "hostKeyStorage shall be configured");
    return _hostKeyStorage.get();
}