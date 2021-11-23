@java.lang.Override
public boolean equals(java.lang.Object o) {
    boolean result = false;
    if ((o != null) && (o instanceof de.aw.gv.CashUmsatz)) {
        de.aw.gv.CashUmsatz cu = ((de.aw.gv.CashUmsatz) (o));
        if ((mSplitBuchung) == null) {
            result = (cu.mSplitBuchung) == null;
        }else {
            result = mSplitBuchung.equals(cu.mSplitBuchung);
        }
        if (result) {
            result = super.equals(o);
        }
    }
    return result;
}