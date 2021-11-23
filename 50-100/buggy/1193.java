public java.lang.String updateUser() {
    try {
        userFacade.updateUser(selectedUser, updateRoles);
        addMessage((((selectedUser.getUsername()) + " ") + (getMessageFromProperty("#{msg['user.updated']}"))));
    } catch (ro.msg.edu.business.common.exception.TechnicalException | ro.msg.edu.business.common.exception.UserNotFoundException e) {
        addMessage(e.getMessage());
    }
    return ro.msg.edu.client.beans.UserBean.EDIT_USERS;
}