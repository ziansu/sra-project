public void setParameterReadOnly(java.lang.Integer index, boolean readOnly) {
    org.openhab.binding.zwave.internal.protocol.ZWaveConfigurationParameter configurationParameter;
    configurationParameter = configParameters.get(index);
    if (configurationParameter == null) {
        configurationParameter = new org.openhab.binding.zwave.internal.protocol.ZWaveConfigurationParameter(index, 0, 1);
        configParameters.put(index, configurationParameter);
    }
    configurationParameter.setReadOnly(readOnly);
}