@java.lang.Override
public void error(final com.vaadin.server.ErrorEvent event) {
    org.eclipse.hawkbit.ui.components.HawkbitUIErrorHandler.LOG.error("Error in UI: ", event.getThrowable());
    final com.google.common.base.Optional<com.vaadin.server.Page> originError = org.eclipse.hawkbit.ui.components.HawkbitUIErrorHandler.getPageOriginError(event);
    if (originError.isPresent()) {
        final org.eclipse.hawkbit.ui.components.HawkbitErrorNotificationMessage message = buildNotification(org.eclipse.hawkbit.ui.components.HawkbitUIErrorHandler.getRootExceptionFrom(event));
        message.show(originError.get());
    }
}