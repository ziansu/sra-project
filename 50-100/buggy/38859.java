public void setCertificate(final java.security.cert.X509Certificate cert) throws org.xipki.ca.server.mgmt.api.CAMgmtException {
    org.xipki.common.ParamChecker.assertNotNull("cert", cert);
    if ((org.xipki.common.util.SecurityUtil.hasKeyusage(cert, KeyUsage.keyCertSign)) == false) {
        throw new org.xipki.ca.server.mgmt.api.CAMgmtException("CA certificate does not have keyusage keyCertSign");
    }
    this.cert = cert;
    this.subject = org.xipki.common.util.SecurityUtil.getRFC4519Name(cert.getSubjectX500Principal());
}