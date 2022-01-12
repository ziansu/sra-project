private boolean loadAuditFingerprints() {
    try {
        if (!(this.classDataLoaded)) {
            hudson.XmlFile file = getSerializationAuditFile();
            if (file.exists()) {
                this.auditWarnings = ((java.util.Collection<hudson.plugins.findbugs.audit.AuditFingerprint>) (file.read()));
                this.classDataLoaded = true;
                return true;
            }
        }else {
            return true;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return false;
}