public java.lang.Object functionGetSA(edu.usc.ict.nl.kb.DialogueKBInterface is, edu.usc.ict.nl.vhmsg.VHBridge vhBridge, java.lang.String sa, boolean simulate) {
    if (!simulate) {
        try {
            return getTextForSpeechAct(sa, is, false);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return null;
}