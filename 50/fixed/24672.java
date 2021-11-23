public boolean getUseFlagNames() {
    if ((configuration) != null) {
        return configuration.getPropertyBool(Mask.ImageType.PARAMETER_NAME_MASK_L2_FLAGNAMES_ENABLED, Mask.ImageType.DEFAULT_L2_FLAGNAMES_ENABLED);
    }else {
        return Mask.ImageType.DEFAULT_L2_FLAGNAMES_ENABLED;
    }
}