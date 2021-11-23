@java.lang.Override
public java.lang.Throwable doNfcInBackground() throws java.io.IOException {
    updateNFCData(mWizardFragmentListener.nfcGetFingerprints(), mWizardFragmentListener.nfcGetAid(), mWizardFragmentListener.nfcGetUserId(), false);
    return null;
}