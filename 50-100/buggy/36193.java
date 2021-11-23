protected java.util.Map<java.lang.String, uk.gov.gchq.gaffer.federated.rest.dto.Schema> fetchSchemaMaps() {
    final java.util.Map<java.lang.String, uk.gov.gchq.gaffer.federated.rest.dto.Schema> schemaMap = new java.util.HashMap<>();
    for (final java.lang.String url : config.getUrls()) {
        final uk.gov.gchq.gaffer.federated.rest.dto.Schema schemaPart = requestor.doGet(url, ("graph/" + (uk.gov.gchq.gaffer.federated.rest.service.IFederatedGraphConfigurationService.SCHEMA_PATH)), new uk.gov.gchq.gaffer.federated.rest.TypeReferenceFederatedImpl.Schema(), true);
        schemaMap.put(url, schemaPart);
    }
    return schemaMap;
}