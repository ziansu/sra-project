public int compare(java.io.File f1, java.io.File f2) {
    if (listener != null) {
        listener.onSortStep(f1, f2);
    }
    try {
        int value = de.milchreis.cps.CPS.getCreationDate(f1).compareTo(de.milchreis.cps.CPS.getCreationDate(f2));
        if (value == 0) {
            return f1.getName().compareTo(f2.getName());
        }else {
            return value;
        }
    } catch (java.lang.Exception e) {
        return 0;
    }
}