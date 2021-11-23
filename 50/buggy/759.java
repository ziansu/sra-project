private boolean includeRow(main.xls.poi.HSSFCell cell, java.lang.String group) {
    if (isRowGroupNonSpecific(cell)) {
        return true;
    }
    return isRowRelatedToSelectedGroup(cell, group);
}