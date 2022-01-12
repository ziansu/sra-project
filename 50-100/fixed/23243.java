public final void removeSplitzeile(de.aw.monma.gv.SplitZeile sz) {
    if (((mSplitBuchung) != null) && ((mSplitBuchung.removeSplitZeile(sz)) == 0)) {
        setAmount(sz.getAmount());
        setMemo(sz.getMemo());
        setCatID(sz.getCatID());
        removeSplittBuchung();
    }
}