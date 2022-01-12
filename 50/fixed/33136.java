public boolean willArchiveMerge() {
    return serverConfigurationService.getBoolean("kaltura.archive.support.enabled", false);
}