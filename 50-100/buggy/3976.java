@java.lang.Override
public java.util.List<hu.schonherz.administration.serviceapi.dto.UserDTO> getUsers(hu.schonherz.administration.serviceapi.dto.UserRole role) {
    if (role.equals(UserRole.ADMIN)) {
        try {
            throw new hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException("Admin role is not allowed");
        } catch (hu.schonherz.administration.serviceapi.exeption.NotAllowedRoleException e) {
            e.getErrMessage();
        }
    }
    org.springframework.data.jpa.domain.Specification<hu.schonherz.administration.persistence.entities.User> roleSpec = buildRoleSpecification(role);
    return hu.schonherz.administration.service.converter.UserConverter.toVo(userDao.findAll(roleSpec));
}