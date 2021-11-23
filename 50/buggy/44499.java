public static java.lang.String resourceProviderFromResourceId(java.lang.String id) {
    return com.microsoft.azure.management.resources.fluentcore.arm.ResourceId.parseResourceId(id).providerNamespace();
}