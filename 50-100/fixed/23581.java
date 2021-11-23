private void parseBindingConfig(java.lang.String pvBindingConfig) throws org.openhab.model.item.binding.BindingConfigParseException {
    java.lang.String[] lvConfigParts = pvBindingConfig.trim().split(";");
    for (java.lang.String lvConfigPart : lvConfigParts) {
        parseMaxWarning(lvConfigPart);
        parseMinWarning(lvConfigPart);
    }
    if (!(((ivMaxWarningValue) != null) || ((ivMinWarningValue) != null))) {
        org.openhab.binding.onewire.internal.deviceproperties.OneWireDevicePropertySwitchMinMaxNumberWarningBindingConfig.LOGGER.error("maxWarning or minWarning must be set in config!");
        throw new org.openhab.model.item.binding.BindingConfigParseException("Onewire sensor configuration must contain maxWarning or minWarning Value!");
    }
}