public boolean hasCN() {
    boolean isCopyNumberPositive = false;
    for (com.bina.varsim.types.variant.alt.Alt alt : alts) {
        if ((alt.getCopyNumber()) > 1) {
            isCopyNumberPositive = true;
        }
    }
    return isCopyNumberPositive;
}