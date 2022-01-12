@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean isEqual = false;
    try {
        isEqual = ((obj.getClass()) != (dss.lingvo.hflts.TTHFLTS.class)) && (java.util.Arrays.equals(this.terms, ((dss.lingvo.hflts.TTHFLTS) (obj)).getTerms()));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return isEqual;
}