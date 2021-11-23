private void onInstantiateUnlockMethod() {
    switch (mWizardModel.getSecretKeyType()) {
        case PASSPHRASE :
            {
                onInstantiatePassphraseUnlockMethod();
            }
            break;
        case PIN :
            {
                onInstantiatePinUnlockMethod();
            }
            break;
        case PATTERN :
            {
                onInstantiatePatternUnlockMethod();
            }
            break;
        case NFC_TAG :
            {
                onInstantiateNFCUnlockMethod();
            }
            break;
    }
}