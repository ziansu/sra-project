private void doBack() {
    if ((PASSCODE_STEP) == 1) {
        first_passcode = null;
        loadPasscodeView();
    }else {
        finish();
    }
}