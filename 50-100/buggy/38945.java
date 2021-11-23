public void enablePKI(java.lang.String priv_key, java.lang.String pub_key, java.lang.String certificate) {
    this.m_pki_priv_key = priv_key;
    this.m_pki_pub_key = pub_key;
    this.m_pki_cert = certificate;
    if ((this.initializeSSLContext()) == true) {
        this.m_use_pki = true;
        this.m_forced_ssl = true;
    }else {
        this.m_pki_priv_key = null;
        this.m_pki_pub_key = null;
        this.m_pki_cert = null;
        this.m_ssl_context = null;
    }
}