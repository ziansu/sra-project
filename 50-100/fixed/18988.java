@java.lang.Override
public void error(final com.vaadin.server.ErrorEvent event) {
    final com.google.common.base.Optional<com.vaadin.server.Page> originError = org.eclipse.hawkbit.ui.components.HawkbitUIErrorHandler.getPageOriginError(event);
    if (originError.isPresent()) {
        final org.eclipse.hawkbit.ui.components.HawkbitErrorNotificationMessage message = buildNotification(org.eclipse.hawkbit.ui.components.HawkbitUIErrorHandler.getRootExceptionFrom(event));
        message.show(originError.get());
    }
}