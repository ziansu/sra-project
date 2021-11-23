private void showView() {
    if ((comeFrom) == 2) {
        if ((sdk.account) != null) {
            usn_et.setText(sdk.account.getUsn());
            psd_et.setText(sdk.account.getPsd());
        }
    }
}