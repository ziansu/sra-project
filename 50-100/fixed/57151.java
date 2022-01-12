public boolean match(final org.xipki.pki.ocsp.server.impl.IssuerEntry issuer) {
    if ((id) != (issuer.getId())) {
        return false;
    }
    if ((revocationTimeMs) == null) {
        return (issuer.getRevocationInfo()) == null;
    }else {
        if ((issuer.getRevocationInfo()) == null) {
            return false;
        }else {
            return (revocationTimeMs) == (issuer.getRevocationInfo().getRevocationTime().getTime());
        }
    }
}