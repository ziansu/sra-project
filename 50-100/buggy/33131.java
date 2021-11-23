public int compare(java.io.File f1, java.io.File f2) {
    if (listener != null) {
        listener.onSortStep(f1, f2);
    }
    try {
        return de.milchreis.cps.CPS.getCreationDate(f1).compareTo(de.milchreis.cps.CPS.getCreationDate(f2));
    } catch (java.lang.Exception e) {
        return 0;
    }
}