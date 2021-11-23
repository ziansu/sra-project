public void addBrowserField(org.adempiere.model.MBrowseField field, int column) {
    if (field.isDisplayed()) {
        displayIndex.put(column, noViewColumns);
        fieldIndexes.put(noViewColumns, column);
        (noViewColumns)++;
    }
    columnNamesIndex.put(field.getAD_View_Column().getAD_Column().getColumnName(), column);
    browserFields.put(column, field);
}