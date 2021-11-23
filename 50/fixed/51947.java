private void serialiseAuditFingerprints() {
    try {
        hudson.XmlFile file = getSerializationAuditFile();
        file.write(this.auditWarnings);
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io);
    }
}