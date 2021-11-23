public static java.util.List<java.lang.String> getUniqueAttributesNames(org.wso2.carbon.registry.core.Registry registry, java.lang.String mediaType) throws org.wso2.carbon.governance.api.exception.GovernanceException {
    org.wso2.carbon.governance.api.util.GovernanceArtifactConfiguration configuration = null;
    try {
        configuration = org.wso2.carbon.governance.api.util.GovernanceUtils.getArtifactConfigurationByMediaType(registry, mediaType);
        return configuration.getUniqueAttributes();
    } catch (org.wso2.carbon.registry.core.exceptions.RegistryException e) {
        throw new org.wso2.carbon.governance.api.exception.GovernanceException(e);
    }
}