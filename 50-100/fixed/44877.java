@java.lang.Override
public java.util.List<hu.schonherz.administration.serviceapi.dto.UserDTO> getUsers(hu.schonherz.administration.serviceapi.dto.UserRole role, java.util.Date lastModified) throws hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException {
    if (role.equals(UserRole.ADMIN)) {
        throw new hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException("Admin role is not allowed");
    }
    org.springframework.data.jpa.domain.Specification<hu.schonherz.administration.persistence.entities.User> spec = org.springframework.data.jpa.domain.Specifications.where(buildRoleSpecification(role)).and(hu.schonherz.administration.persistence.dao.helper.UserSpecification.lastModifiedAt(lastModified));
    return hu.schonherz.administration.service.converter.UserConverter.toVo(userDao.findAll(spec));
}