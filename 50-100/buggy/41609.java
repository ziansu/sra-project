public void setParameterReadOnly(java.lang.Integer index, boolean readOnly) {
    org.openhab.binding.zwave.internal.protocol.ZWaveConfigurationParameter configurationParameter;
    configurationParameter = this.configParameters.get(index);
    if (configurationParameter == null) {
        configurationParameter = new org.openhab.binding.zwave.internal.protocol.ZWaveConfigurationParameter(index, 0, 1);
    }
    configurationParameter.setReadOnly(readOnly);
}