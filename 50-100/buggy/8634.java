public boolean isAltACTGN() {
    for (com.bina.varsim.types.variant.alt.Alt a : alts) {
        if (a.getSeq().isSeq()) {
            if (!(a.getSeq().toString().matches("[ACTGN]*"))) {
                return false;
            }
        }
    }
    return true;
}