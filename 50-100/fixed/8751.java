private void show(java.lang.String address) {
    tvAddress.setText(address);
    etPaymentId.setEnabled(true);
    etAmount.setEnabled(true);
    bPaymentId.setEnabled(true);
    bGenerate.setEnabled(true);
    hideProgress();
    generateQr();
}