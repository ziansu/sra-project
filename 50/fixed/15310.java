@java.lang.Override
public com.microsoft.azure.PagedList<com.microsoft.azure.management.network.PublicIpAddress> list() throws com.microsoft.azure.CloudException, java.io.IOException {
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.PagedList<com.microsoft.azure.management.network.implementation.api.PublicIPAddressInner>> response = client.listAll();
    return converter.convert(response.getBody());
}