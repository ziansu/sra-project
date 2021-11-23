private void storeCertificate(java.security.cert.X509Certificate certificate, java.lang.String ctrlDerFilename) {
    try {
        java.io.FileOutputStream ctrlDerOutputStream = new java.io.FileOutputStream(ctrlDerFilename);
        ctrlDerOutputStream.write(certificate.getEncoded());
        ctrlDerOutputStream.close();
        consoleOutputController.logOnScreen(java.lang.String.format(keySavedMessage, ctrlDerFilename));
    } catch (java.io.IOException | java.security.cert.CertificateEncodingException e) {
        throw new ch.ge.ve.offlineadmin.exception.KeyGenerationRuntimeException("error while storing the certificate", e);
    }
}