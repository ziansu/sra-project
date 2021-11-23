protected java.time.ZoneId getClientTimeZone() {
    org.apache.wicket.core.request.ClientInfo info = org.apache.wicket.Session.get().getClientInfo();
    if (info instanceof org.apache.wicket.protocol.http.request.WebClientInfo) {
        java.util.TimeZone timeZone = ((org.apache.wicket.protocol.http.request.WebClientInfo) (info)).getProperties().getTimeZone();
        return timeZone.toZoneId();
    }
    return null;
}