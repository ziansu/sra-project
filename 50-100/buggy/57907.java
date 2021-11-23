public java.lang.String createNewUser() {
    try {
        newUser.setRoles(roleBean.getSelectedRoles());
        roleBean.setSelectedRoles(null);
        edu.msg.ro.business.dto.UserDTO newCreatedUser = userFacade.createUser(newUser);
        displayMessageI18N(bean.UserBean.CREATED_USER_SUCCESS_MESSAGE);
        notificationBean.sendUserCreateNotification(NotificationType.WELCOME_NEW_USER, newCreatedUser);
        newUser = new edu.msg.ro.business.dto.UserDTO();
        return util.PagesProperties.USERS_PAGE;
    } catch (edu.msg.ro.business.exception.JBugsException e) {
        handleExceptionI18N(e);
    }
    return null;
}