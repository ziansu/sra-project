public boolean isSeekByTimeExclusive() {
    return getString(net.pms.configuration.RendererConfiguration.SEEK_BY_TIME, "").equalsIgnoreCase("exclusive");
}