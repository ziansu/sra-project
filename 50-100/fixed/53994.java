public void editTrustBundle() {
    org.nhind.config.common.Certificate cert = null;
    if ((selectedTb.getSigningCertificateData()) != null) {
        cert = new org.nhind.config.common.Certificate();
        cert.setData(selectedTb.getSigningCertificateData());
    }
    directService.updateTrustBundle(selectedTb.getId(), selectedTb.getBundleName(), selectedTb.getBundleURL(), cert, selectedTb.getRefreshInterval());
}