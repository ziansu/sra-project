public java.lang.String createChecksum(java.lang.String filePath) {
    java.lang.String checksum = "";
    try {
        try (java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(filePath))) {
            checksum = org.apache.commons.codec.digest.DigestUtils.sha256Hex(fis);
        }
    } catch (java.io.FileNotFoundException ex) {
        java.util.logging.Logger.getLogger(lockitdown.model.CorruptionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(lockitdown.model.CorruptionCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return checksum;
}