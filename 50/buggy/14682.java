public synchronized void setCertificateLocalization(org.apache.hadoop.security.ssl.CertificateLocalization certificateLocalization) {
    if ((this.certificateLocalization) != null) {
        return ;
    }
    this.certificateLocalization = certificateLocalization;
}