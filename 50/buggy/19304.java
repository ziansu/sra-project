@java.lang.Override
public java.lang.String getMantaKeyPath() {
    return configuration.get(MapConfigContext.MANTA_KEY_PATH_KEY, com.joyent.manta.config.DefaultsConfigContext.MANTA_KEY_PATH);
}