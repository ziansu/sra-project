@java.lang.Override
public void resetNumberOnBadge(java.lang.String userId) {
    org.exoplatform.commons.notification.impl.jpa.web.entity.WebParamsEntity paramsEntity = new org.exoplatform.commons.notification.impl.jpa.web.entity.WebParamsEntity();
    paramsEntity.setName("resetNumberOnBadge");
    paramsEntity.setValue("true");
    try {
        for (org.exoplatform.commons.notification.impl.jpa.web.entity.WebNotifEntity webNotifEntity : getNewMessage(userId, 1)) {
            paramsEntity.setNotification(webNotifEntity);
            webNotifEntity.addParameter(paramsEntity);
            webNotifDAO.update(webNotifEntity);
        }
    } catch (java.lang.Exception e) {
        org.exoplatform.commons.notification.impl.jpa.web.JPAWebNotificationStorage.LOG.error("Failed to resetNumberOnBadge() ", e);
    }
}