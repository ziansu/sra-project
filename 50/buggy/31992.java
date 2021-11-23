private java.lang.Object functionGet(edu.usc.ict.nl.kb.DialogueKBInterface is, edu.usc.ict.nl.vhmsg.VHBridge vhBridge, java.lang.String vname, boolean simulate) {
    if (!simulate)
        return is.get(vname);
    else
        return null;
    
}