public boolean willArchiveMerge() {
    boolean merge = false;
    merge = serverConfigurationService.getBoolean("kaltura.archive.support.enabled", false);
    return merge;
}