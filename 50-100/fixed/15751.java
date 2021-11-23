public java.lang.String unicodeSerialize() {
    if (this.isOpaqueOrigin())
        return "null";
    
    org.stdurl.host.Host unicodeHost = this.host;
    if ((unicodeHost != null) && (unicodeHost.isDomain()))
        unicodeHost = new org.stdurl.host.Domain(org.stdurl.idna.IDNA.domainToUnicode(unicodeHost.toDomain().getDomain()));
    
    org.stdurl.origin.Origin unicodeOrigin = new org.stdurl.origin.Origin(this.scheme, unicodeHost, this.port, null);
    return unicodeOrigin.asciiSerialize();
}