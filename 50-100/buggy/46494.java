public void validateEmail(edu.msg.ro.business.user.dto.UserDTO user) throws edu.msg.ro.business.common.exception.BusinessException {
    edu.msg.ro.persistence.user.entity.User existingUserWithSameEmail = userDAO.findUserByEmail(user.getEmail());
    if (!(existingUserWithSameEmail.getId().equals(user.getId()))) {
        if (existingUserWithSameEmail != null) {
            throw new edu.msg.ro.business.common.exception.BusinessException(edu.msg.ro.business.user.validation.UserValidator.I18N_USER_EMAIL_EXISTS, new java.lang.Object[]{ user.getEmail() });
        }
    }
}