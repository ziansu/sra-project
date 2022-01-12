public void setCertificate(final java.security.cert.X509Certificate cert) throws org.xipki.ca.server.mgmt.api.CAMgmtException {
    if (cert == null) {
        this.cert = null;
        this.subject = null;
    }else {
        if ((org.xipki.common.util.SecurityUtil.hasKeyusage(cert, KeyUsage.keyCertSign)) == false) {
            throw new org.xipki.ca.server.mgmt.api.CAMgmtException("CA certificate does not have keyusage keyCertSign");
        }
        this.cert = cert;
        this.subject = org.xipki.common.util.SecurityUtil.getRFC4519Name(cert.getSubjectX500Principal());
    }
}