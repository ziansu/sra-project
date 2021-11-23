public final de.aw.monma.gv.SplitBuchung createSplitbuchung() {
    removeGegenbuchung();
    if ((mSplitBuchung) == null) {
        mSplitBuchung = new de.aw.monma.gv.SplitBuchung(this);
    }
    mSplitBuchung.setRemoved(false);
    setHasSplitBuchung(true);
    return mSplitBuchung;
}