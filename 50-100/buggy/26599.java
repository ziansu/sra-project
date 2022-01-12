@java.lang.Override
public com.grad.project.nc.service.domains.Domain convertFrontendDomainToDomain(com.grad.project.nc.controller.api.dto.FrontendDomain frontendDomain) {
    com.grad.project.nc.service.domains.Domain domain = new com.grad.project.nc.service.domains.Domain();
    domain.setDomainName(frontendDomain.getDomainName());
    domain.setAddress(convertFrontendAddresToAddress(frontendDomain.getAddress()));
    domain.setDomainType(convertFrontendCategoryToCategory(frontendDomain.getDomainType()));
    domain.setUsers(frontendDomain.getUsers());
    return domain;
}