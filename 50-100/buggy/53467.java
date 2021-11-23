public java.lang.String createChecksum(java.io.File file) {
    java.lang.String checksum = "";
    try {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(file)) {
            checksum = org.apache.commons.codec.digest.DigestUtils.sha256Hex(fis);
        }
    } catch (java.io.FileNotFoundException ex) {
        java.util.logging.Logger.getLogger(lockitdown.model.CorruptionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(lockitdown.model.CorruptionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return checksum;
}