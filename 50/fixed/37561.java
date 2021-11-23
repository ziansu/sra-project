private java.util.Properties readLisProperties() {
    return new com.luckia.biller.core.common.SettingsManager().load().getProperties(Constants.CONFIG_SECTION_JPA_LIS);
}