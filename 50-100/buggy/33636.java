public org.apache.struts.action.ActionForward sendNotification(org.apache.struts.action.ActionMapping mapping, org.kuali.kra.subaward.SubAwardForm subAwardForm, java.lang.String notificationType, java.lang.String notificationString) {
    org.kuali.kra.subaward.bo.SubAward subAward = subAwardForm.getSubAwardDocument().getSubAward();
    org.kuali.kra.subaward.notification.SubAwardNotificationContext context = new org.kuali.kra.subaward.notification.SubAwardNotificationContext(subAward, notificationType, notificationString, org.kuali.kra.infrastructure.Constants.MAPPING_SUBAWARD_PAGE);
    if (subAwardForm.getNotificationHelper().getPromptUserForNotificationEditor(context)) {
        subAwardForm.getNotificationHelper().initializeDefaultValues(context);
        return mapping.findForward("notificationEditor");
    }else {
        getNotificationService().sendNotification(context);
        return mapping.findForward(Constants.MAPPING_BASIC);
    }
}