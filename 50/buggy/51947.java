private void serialiseAuditFingerprints() {
    try {
        hudson.XmlFile file = getSerializationAuditFile();
        file.write(this.auditWarnings);
        file.write(this.newNumberOfConfirmedWarnings);
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io);
    }
}