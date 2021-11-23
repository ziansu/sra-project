@java.lang.Override
public com.google.common.base.Optional<org.opentestsystem.delivery.logging.EventInfo> parsePostHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.Object handler, java.lang.Object handler, org.opentestsystem.delivery.logging.EventLogger logger) {
    return parsePreHandle(request, handler, logger);
}