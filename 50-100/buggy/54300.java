public java.lang.String deleteUser(ro.msg.edu.business.user.dto.UserDTO user) {
    try {
        userFacade.deleteUser(user);
        addMessage((((user.getUsername()) + " ") + (getMessageFromProperty("#{msg['user.deleted']}"))));
    } catch (ro.msg.edu.business.common.exception.TechnicalException | ro.msg.edu.business.common.exception.UserNotFoundException e) {
        addMessage(e.getMessage());
    }
    return ro.msg.edu.client.beans.UserBean.DELETE_USER;
}