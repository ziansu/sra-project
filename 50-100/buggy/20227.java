private void show(final java.lang.String address) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        public void run() {
            tvAddress.setText(address);
            etPaymentId.setEnabled(true);
            etAmount.setEnabled(true);
            bPaymentId.setEnabled(true);
            bGenerate.setEnabled(true);
            hideProgress();
            generateQr();
        }
    });
}