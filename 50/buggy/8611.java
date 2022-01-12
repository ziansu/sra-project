@java.lang.Override
public java.lang.String getFormula() {
    try {
        return isEmpty() ? null : poiCell.getCellFormula();
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}