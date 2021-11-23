@org.springframework.transaction.annotation.Transactional(readOnly = true)
public lt.tieto.msi2016.user.model.User get(java.lang.Long id) {
    if ((securityService.getCurrentUser().getId()) != id) {
        throw new org.springframework.security.access.AccessDeniedException(("Cannot access user data id=" + id));
    }
    lt.tieto.msi2016.user.repository.model.UserDb user = repository.findOne(id);
    if (user != null) {
        return lt.tieto.msi2016.user.service.UserService.mapToUser(user);
    }else {
        throw new lt.tieto.msi2016.utils.exception.DataNotFoundException((("User with id " + id) + " not found"));
    }
}