@java.lang.Override
public java.lang.Number getNumber() {
    try {
        return isEmpty() ? null : poiCell.getNumericCellValue();
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}