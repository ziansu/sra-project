public edu.msg.ro.business.dto.NotificationDTO createUserNotification(edu.msg.ro.persistence.attribute.NotificationType notificationType, java.lang.String message, edu.msg.ro.business.dto.UserDTO updatedUser) throws edu.msg.ro.business.exception.TechnicalException {
    java.util.List<edu.msg.ro.business.dto.UserDTO> receivers = new java.util.ArrayList<>();
    switch (notificationType) {
        case USER_UPDATED :
            {
                receivers = notificationReceiversService.getUserUpdateNotificationReceivers(updatedUser);
                break;
            }
        case USER_DELETED :
            {
                receivers = notificationReceiversService.getUserDeletedNotificationReceivers();
                break;
            }
        case WELCOME_NEW_USER :
            {
                receivers = notificationReceiversService.getUserCreatedNotificationReceivers(updatedUser);
                break;
            }
    }
    return createUserActionNotification(notificationType, message, receivers);
}