private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
    setEditableEmployeeInfoPanel(false);
    clearEmployeeInfo();
    updateDisplayTable();
    if ((editingEmployee) != null) {
        employeeList.setSelectedValue(editingEmployee, true);
        displayEmployeeInfo(editingEmployee);
    }
}