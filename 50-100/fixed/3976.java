@java.lang.Override
public java.util.List<hu.schonherz.administration.serviceapi.dto.UserDTO> getUsers(hu.schonherz.administration.serviceapi.dto.UserRole role) throws hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException {
    if (role.equals(UserRole.ADMIN)) {
        throw new hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException("Admin role is not allowed");
    }
    org.springframework.data.jpa.domain.Specification<hu.schonherz.administration.persistence.entities.User> roleSpec = buildRoleSpecification(role);
    return hu.schonherz.administration.service.converter.UserConverter.toVo(userDao.findAll(roleSpec));
}