public net.maritimecloud.identityregistry.model.database.entities.Service selectiveCopyTo(net.maritimecloud.identityregistry.model.database.entities.EntityModel target) {
    net.maritimecloud.identityregistry.model.database.entities.Service service = ((net.maritimecloud.identityregistry.model.database.entities.Service) (super.selectiveCopyTo(target)));
    service.setOidcAccessType(oidcAccessType);
    service.setOidcRedirectUri(oidcRedirectUri);
    service.setCertDomainName(certDomainName);
    service.setInstanceVersion(instanceVersion);
    service.setChildIds();
    return service;
}