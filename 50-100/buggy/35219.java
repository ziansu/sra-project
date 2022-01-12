private org.openhab.binding.em.internal.EMBindingConfig findConfig(org.openhab.binding.em.internal.EMBindingConfig.EMType type, java.lang.String address, org.openhab.binding.em.internal.EMBindingConfig.Datapoint datapoint) {
    org.openhab.binding.em.internal.EMBindingConfig emConfig = null;
    for (org.openhab.binding.em.EMBindingProvider provider : this.providers) {
        emConfig = provider.getConfigByTypeAndAddressAndDatapoint(type, address, Datapoint.CUMULATED_VALUE);
        if (emConfig != null) {
            return emConfig;
        }
    }
    return null;
}