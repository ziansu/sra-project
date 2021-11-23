public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String newValue = burp.MoreHelp.showPlainInputMessage((("Rename the \"" + (columnObj.getDefaultVisibleName())) + "\" column"), "Rename column name", columnObj.getVisibleName());
    if (newValue.isEmpty()) {
        newValue = columnObj.getDefaultVisibleName();
    }
    columnObj.setVisibleName(newValue);
    saveAndReloadTableSettings();
}