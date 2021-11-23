private static java.lang.String sessionTracking(java.lang.String trackingMode) {
    if ("COOKIE".equalsIgnoreCase(trackingMode)) {
        return SessionPropagation.COOKIE.name();
    }
    if ("URL".equalsIgnoreCase(trackingMode)) {
        return SessionPropagation.URL.name();
    }
    com.amadeus.session.servlet.WebXmlParser.logger.warn("Unsupported session tracking mode {}. Will be using default one.", trackingMode);
    return SessionPropagation.DEFAULT.name();
}