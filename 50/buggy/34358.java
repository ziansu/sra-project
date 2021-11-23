public java.util.Map<java.lang.String, java.lang.String> getKeys() {
    return (this.keys) == null ? null : this.keys.entrySet().stream().collect(org.cloudfoundry.identity.uaa.zone.TokenPolicy.outputCollector);
}