public java.lang.String deleteUser(ro.msg.edu.business.user.dto.UserDTO user) {
    try {
        ro.msg.edu.business.user.dto.UserDTO userDeactivated = userFacade.deleteUser(user);
        notificationFacade.createNotification(NotificationType.USER_DEACTIVATED, getNotificationMessageDeactivateUser(userDeactivated), ro.msg.edu.client.beans.UserBean.DELETE_USER_URL, new ro.msg.edu.business.bug.dto.BugDTO(), userFacade.findAllAdministrators());
        addMessage((((user.getUsername()) + " ") + (getMessageFromProperty("#{msg['user.deleted']}"))));
    } catch (ro.msg.edu.business.common.exception.JBugsException e) {
        addMessage(e.getMessage());
    }
    return ro.msg.edu.client.beans.UserBean.DELETE_USER;
}