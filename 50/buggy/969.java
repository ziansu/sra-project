private boolean isRowRelatedToSelectedGroup(main.xls.poi.HSSFCell cell, java.lang.String group) {
    return getGroupsNumbers(cell).contains(group.toString());
}