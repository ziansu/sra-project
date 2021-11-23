public java.util.List<hudson.plugins.findbugs.audit.AuditFingerprint> getFalsePositiveWarnings() {
    java.util.List<hudson.plugins.findbugs.audit.AuditFingerprint> warnings = new java.util.ArrayList<hudson.plugins.findbugs.audit.AuditFingerprint>();
    for (hudson.plugins.findbugs.audit.AuditFingerprint fingerprint : this.auditWarnings) {
        if (fingerprint.isFalsePositive()) {
            warnings.add(fingerprint);
        }
    }
    return warnings;
}