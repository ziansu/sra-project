private org.openmuc.jdlms.datatypes.BitString getMergedFlags(final com.alliander.osgp.dto.valueobjects.smartmetering.ConfigurationObject configurationObject, final com.alliander.osgp.dto.valueobjects.smartmetering.ConfigurationObject configurationObjectOnDevice) {
    final java.util.List<com.alliander.osgp.dto.valueobjects.smartmetering.ConfigurationFlag> configurationFlags = this.getNewFlags(configurationObject);
    this.mergeOldFlags(configurationObjectOnDevice, configurationFlags);
    final byte[] newConfigurationObjectFlagsByteArray = this.configurationObjectHelperService.toByteArray(configurationFlags);
    return new org.openmuc.jdlms.datatypes.BitString(newConfigurationObjectFlagsByteArray, 16);
}