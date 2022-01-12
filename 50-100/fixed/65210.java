private boolean loadAuditFingerprints() {
    try {
        hudson.XmlFile file = getSerializationAuditFile();
        if (file.exists()) {
            if (!(this.classDataLoaded)) {
                this.auditWarnings = ((java.util.Collection<hudson.plugins.findbugs.audit.AuditFingerprint>) (file.read()));
                this.classDataLoaded = true;
            }
            return true;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return false;
}