public final void sign(net.named_data.jndn.Data data, net.named_data.jndn.encoding.WireFormat wireFormat) throws java.lang.SecurityException {
    net.named_data.jndn.security.certificate.IdentityCertificate signingCertificate = identityManager_.getDefaultCertificate();
    if (signingCertificate == null) {
        setDefaultCertificate();
        signingCertificate = identityManager_.getDefaultCertificate();
    }
    net.named_data.jndn.Name certificateName = signingCertificate.getName();
    identityManager_.signByCertificate(data, certificateName, wireFormat);
}