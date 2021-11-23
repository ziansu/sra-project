private void validateAndLoadDefaultProperties() {
    if (null == (carbonProperties.getProperty(CarbonCommonConstants.STORE_LOCATION))) {
        carbonProperties.setProperty(CarbonCommonConstants.STORE_LOCATION, CarbonCommonConstants.STORE_LOCATION_DEFAULT_VAL);
    }
    validateBlockletSize();
    validateNumCores();
    validateNumCoresBlockSort();
    validateSortSize();
    validateBadRecordsLocation();
    validateHighCardinalityIdentify();
    validateHighCardinalityThreshold();
    validateHighCardinalityInRowCountPercentage();
    validateCarbonDataFileVersion();
    validateExecutorStartUpTime();
    validatePrefetchBufferSize();
    validateBlockletGroupSizeInMB();
    validateNumberOfColumnPerIORead();
    validateNumberOfRowsPerBlockletColumnPage();
}