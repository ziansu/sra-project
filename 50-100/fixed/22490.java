@com.google.common.annotations.VisibleForTesting
org.fao.geonet.domain.Pair<org.fao.geonet.services.metadata.format.FormatterImpl, org.fao.geonet.services.metadata.format.FormatterParams> loadMetadataAndCreateFormatterAndParams(jeeves.server.context.ServiceContext context, org.fao.geonet.services.metadata.format.cache.Key key, final org.springframework.web.context.request.NativeWebRequest request) throws java.lang.Exception {
    final org.fao.geonet.domain.Pair<org.jdom.Element, org.fao.geonet.domain.Metadata> elementMetadataPair = getMetadata(context, key.mdId, key.hideWithheld);
    org.jdom.Element metadata = elementMetadataPair.one();
    org.fao.geonet.domain.Metadata metadataInfo = elementMetadataPair.two();
    return createFormatterAndParams(key.lang, key.formatType, key.formatterId, key.width, request, context, metadata, metadataInfo);
}