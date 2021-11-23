public void setConfig(mekanism.api.transmitters.TransmissionType type, byte[] config) {
    sideConfigs.put(type.ordinal(), config);
}