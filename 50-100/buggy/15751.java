public java.lang.String unicodeSerialize() {
    if (this.isOpaqueOrigin())
        return "null";
    
    org.stdurl.host.Host unicodeHost = (((this.host) == null) || (!(this.host.isDomain()))) ? this.host : new org.stdurl.host.Domain(org.stdurl.idna.IDNA.domainToUnicode(this.host.toDomain().getDomain()));
    org.stdurl.origin.Origin unicodeOrigin = new org.stdurl.origin.Origin(this.scheme, unicodeHost, this.port, null);
    return unicodeOrigin.asciiSerialize();
}