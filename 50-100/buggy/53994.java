public void editTrustBundle() {
    org.nhind.config.common.Certificate cert = new org.nhind.config.common.Certificate();
    if ((selectedTb.getSigningCertificateData()) != null) {
        cert.setData(selectedTb.getSigningCertificateData());
    }
    directService.updateTrustBundle(selectedTb.getId(), selectedTb.getBundleName(), selectedTb.getBundleURL(), cert, selectedTb.getRefreshInterval());
}