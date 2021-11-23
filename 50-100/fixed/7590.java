@java.lang.Override
public boolean equals(java.lang.Object obj) throws java.lang.NullPointerException {
    boolean isEqual = false;
    if (obj != null) {
        isEqual = ((obj.getClass()) != (dss.lingvo.hflts.TTHFLTS.class)) && (java.util.Arrays.equals(this.terms, ((dss.lingvo.hflts.TTHFLTS) (obj)).getTerms()));
    }
    return isEqual;
}