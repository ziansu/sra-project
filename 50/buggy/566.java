private java.lang.Long printUsername(java.lang.String username) {
    ro.msg.edu.business.user.dto.UserDTO user = new ro.msg.edu.business.user.dto.UserDTO();
    try {
        user = userService.findUserByUsername(username);
    } catch (ro.msg.edu.business.common.exception.TechnicalException e) {
        handleExceptionI18n(e);
    }
    return user.getId();
}