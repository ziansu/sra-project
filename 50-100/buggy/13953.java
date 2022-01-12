public io.cattle.platform.api.auth.Identity getIdentity(io.cattle.platform.api.auth.Identity identity) {
    io.cattle.platform.api.auth.Identity newIdentity = null;
    for (io.cattle.platform.iaas.api.auth.integration.interfaces.IdentityTransformationHandler identityTransformationHandler : identityTransformationHandlers) {
        if ((identityTransformationHandler.scopes().contains(identity.getExternalIdType())) && (identityTransformationHandler.isConfigured())) {
            newIdentity = identityTransformationHandler.transform(identity);
            break;
        }
    }
    if (newIdentity == null) {
        throw new io.github.ibuildthecloud.gdapi.exception.ClientVisibleException(io.github.ibuildthecloud.gdapi.util.ResponseCodes.BAD_REQUEST, "InvalidIdentityType", "Identity externalIdType is invalid", null);
    }
    return newIdentity;
}