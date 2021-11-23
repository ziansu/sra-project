@java.lang.Override
public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() {
    if (mIsHceCapable) {
        return mCardEmulationManager.getNfcCardEmulationInterface();
    }else {
        return null;
    }
}