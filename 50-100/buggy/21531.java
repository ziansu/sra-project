protected void handleError(final java.lang.Exception e, final java.lang.String correlationUid, final java.lang.String organisationIdentification, final java.lang.String deviceIdentification, final com.alliander.osgp.adapter.ws.schema.smartmetering.notification.NotificationType notificationType) {
    com.alliander.osgp.adapter.ws.smartmetering.infra.jms.messageprocessor.DomainResponseMessageProcessor.LOGGER.info("handeling error: {} for notification type: {}", e.getMessage(), notificationType);
    try {
        this.notificationService.sendNotification(organisationIdentification, deviceIdentification, "NOT_OK", correlationUid, e.getMessage(), notificationType);
    } catch (final com.alliander.osgp.shared.exceptionhandling.FunctionalException e1) {
        com.alliander.osgp.adapter.ws.smartmetering.infra.jms.messageprocessor.DomainResponseMessageProcessor.LOGGER.info("Something went wrong during error handling: {} for notification type: {}", e.getMessage(), notificationType);
    }
}