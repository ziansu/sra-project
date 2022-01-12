@java.lang.Override
public android.nfc.INfcCardEmulation getNfcCardEmulationInterface() {
    if ((mIsHceCapable) && ((mCardEmulationManager) != null)) {
        return mCardEmulationManager.getNfcCardEmulationInterface();
    }else {
        return null;
    }
}