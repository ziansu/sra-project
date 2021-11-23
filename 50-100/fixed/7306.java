public void actionPerformed(java.awt.event.ActionEvent event) {
    int hold = 0;
    newEmployee = new workSQL.Employee(hold, "", "", "", "");
    workSQL.EmployeeDetailDialog addD = new workSQL.EmployeeDetailDialog(thisFrame, thisFrame, "Add a new employee", true, newEmployee);
    addD.updateButton.setEnabled(false);
    addD.deleteButton.setEnabled(false);
    addD.employeeNumberField.setEnabled(false);
    addD.setVisible(true);
}