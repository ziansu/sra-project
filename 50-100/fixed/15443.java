private static java.lang.String sessionTracking(java.lang.String trackingMode) {
    if ("COOKIE".equalsIgnoreCase(trackingMode)) {
        return SessionPropagation.COOKIE.name();
    }
    if ("URL".equalsIgnoreCase(trackingMode)) {
        return SessionPropagation.URL.name();
    }
    return SessionPropagation.DEFAULT.name();
}