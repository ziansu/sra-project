public org.sentilo.platform.common.domain.AlarmInputMessage parseRequest(final org.sentilo.platform.server.request.SentiloRequest request) throws org.sentilo.platform.common.exception.PlatformException {
    final org.sentilo.platform.common.domain.AlarmInputMessage inputMessage = ((org.sentilo.platform.common.domain.AlarmInputMessage) (readInternal(org.sentilo.platform.common.domain.AlarmInputMessage.class, request)));
    if (inputMessage != null) {
        inputMessage.setSender(request.getEntitySource());
        if (org.springframework.util.StringUtils.hasText(request.getResourcePart(0))) {
            inputMessage.setAlertId(request.getResourcePart(0));
        }
    }
    return inputMessage;
}