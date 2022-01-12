private io.gravitee.gateway.handlers.api.definition.Api mockApi(final io.gravitee.gateway.handlers.api.definition.Api api) throws java.lang.Exception {
    final io.gravitee.gateway.handlers.api.definition.Api mockApi = new io.gravitee.gateway.handlers.api.definition.Api();
    mockApi.setId(api.getId());
    mockApi.setDeployedAt(api.getUpdatedAt());
    when(objectMapper.readValue(api.getDefinition(), io.gravitee.gateway.handlers.api.definition.Api.class)).thenReturn(mockApi);
    return mockApi;
}