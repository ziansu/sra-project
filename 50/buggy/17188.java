@java.lang.Override
public boolean getBoolean() {
    try {
        return isEmpty() ? null : poiCell.getBooleanCellValue();
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}