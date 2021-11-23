@java.lang.Override
protected void onNfcStateChange(boolean enabled) {
    if (enabled) {
        toast(getString(org.ndeftools.boilerplate.R.string.nfcAvailableEnabled));
    }else {
        toast(getString(org.ndeftools.boilerplate.R.string.nfcAvailableDisabled));
    }
}