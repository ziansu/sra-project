@java.lang.Override
@java.lang.Deprecated
public java.util.Date getDate() {
    try {
        return isEmpty() ? null : poiCell.getDateCellValue();
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}