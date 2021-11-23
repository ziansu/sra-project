public org.pac4j.core.credentials.TokenCredentials extract(org.pac4j.core.context.WebContext context) throws org.pac4j.core.exception.HttpAction {
    final java.lang.String ip;
    if (alternateIpHeaders.isEmpty()) {
        ip = context.getRemoteAddr();
    }else {
        ip = ipFromHeaders(context);
    }
    if (ip == null) {
        return null;
    }
    return new org.pac4j.core.credentials.TokenCredentials(ip, clientName);
}