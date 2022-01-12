private org.opensaml.saml2.metadata.provider.FilesystemMetadataProvider fileSystemMetadataProvider() {
    org.springframework.core.io.DefaultResourceLoader loader = new org.springframework.core.io.DefaultResourceLoader();
    org.springframework.core.io.Resource metadataResource = loader.getResource(("classpath:/" + (metadataPath)));
    java.io.File oktaMetadata = null;
    try {
        oktaMetadata = metadataResource.getFile();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    org.opensaml.saml2.metadata.provider.FilesystemMetadataProvider filesystemMetadataProvider = null;
    try {
        filesystemMetadataProvider = new org.opensaml.saml2.metadata.provider.FilesystemMetadataProvider(oktaMetadata);
    } catch (org.opensaml.saml2.metadata.provider.MetadataProviderException e) {
        e.printStackTrace();
    }
    filesystemMetadataProvider.setParserPool(parserPool);
    return filesystemMetadataProvider;
}