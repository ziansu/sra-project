private void sendExpiryReminder(com.krishagni.catissueplus.core.biospecimen.domain.CollectionProtocol cp) {
    java.util.Map<java.lang.String, java.lang.Object> emailProps = new java.util.HashMap<java.lang.String, java.lang.Object>();
    emailProps.put("$subject", new java.lang.String[]{ cp.getShortTitle() });
    emailProps.put("cp", cp);
    java.lang.String[] rcpts = new java.lang.String[]{ cp.getPrincipalInvestigator().getEmailAddress() };
    emailService.sendEmail(com.krishagni.catissueplus.core.biospecimen.services.impl.CpExpiringNotification.CP_EXPIRING_NOTIFICATION_TMPL, rcpts, emailProps);
}