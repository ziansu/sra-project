public static java.util.UUID getSnomedDescriptionType(int type) {
    switch (type) {
        case 0 :
            return IsaacMetadataAuxiliaryBinding.DEFINITION_DESCRIPTION_TYPE.getPrimodialUuid();
        case 1 :
            return IsaacMetadataAuxiliaryBinding.PREFERRED.getPrimodialUuid();
        case 2 :
            return IsaacMetadataAuxiliaryBinding.SYNONYM.getPrimodialUuid();
        case 3 :
            return IsaacMetadataAuxiliaryBinding.FULLY_SPECIFIED_NAME.getPrimodialUuid();
    }
    throw new java.lang.RuntimeException(("Unhandled description type " + type));
}