public void handleDatabaseSingleClassResponse(com.educonnect.common.message.dbclass.DatabaseSingleClassResponse d) {
    com.educonnect.common.message.dbclass.Student[] students = d.getClassOfStudents().getStudents();
    int selIndex = tabbedPane.getSelectedIndex();
    if (selIndex != (-1)) {
        java.lang.String titleOfTab = tabbedPane.getTitleAt(selIndex);
        com.educonnect.admin.ui.table.EditTable table = tables.get(titleOfTab);
        com.educonnect.admin.ui.table.EditTableModel etm = ((com.educonnect.admin.ui.table.EditTableModel) (table.getModel()));
        etm.updateServerCopy(students);
        showStatusMessage(("Showing table " + titleOfTab));
    }
}