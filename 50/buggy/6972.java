public boolean prepareToSave() {
    if (!(validateForm())) {
        return false;
    }
    configureOutputManagerFromForm();
    configureOscSenderFromForm();
    return true;
}