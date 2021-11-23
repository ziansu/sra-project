public static java.util.List<java.lang.String> getUniqueAttributesNames(org.wso2.carbon.registry.core.Registry registry, java.lang.String mediaType) throws org.wso2.carbon.governance.api.exception.GovernanceException {
    try {
        org.wso2.carbon.governance.api.util.GovernanceArtifactConfiguration configuration = configuration = org.wso2.carbon.governance.api.util.GovernanceUtils.getArtifactConfigurationByMediaType(registry, mediaType);
        if (configuration != null) {
            return configuration.getUniqueAttributes();
        }
    } catch (org.wso2.carbon.registry.core.exceptions.RegistryException e) {
        throw new org.wso2.carbon.governance.api.exception.GovernanceException(e);
    }
    return null;
}