public edu.msg.ro.business.dto.NotificationDTO createBugNotification(edu.msg.ro.persistence.attribute.NotificationType notificationType, java.lang.String message, edu.msg.ro.business.dto.BugDTO bugDTO) throws edu.msg.ro.business.exception.TechnicalException {
    java.util.List<edu.msg.ro.business.dto.UserDTO> receivers = new java.util.ArrayList<>();
    switch (notificationType) {
        case BUG_CLOSED :
        case BUG_UPDATED :
        case BUG_STATUS_UPDATED :
            {
                receivers = notificationReceiversService.getBugUpdateNotificationReceivers(bugDTO);
                break;
            }
    }
    edu.msg.ro.business.dto.NotificationDTO notification = createUserActionNotification(notificationType, message, receivers, bugDTO);
    return notification;
}