public int getCN(final int ind) {
    if ((ind <= 0) || (ind > (alts.length)))
        return 0;
    
    return alts[(ind - 1)].getSeq().getCopyNumber();
}