public void setAssignment(com.googlesites.skcrawford.gradebook.model.Assignment assignment) {
    this.assignment = assignment;
    nameField.setText(assignment.getName());
    java.lang.String firstCategory = addCategoryOptions();
    categoryMenu.setValue(firstCategory);
    totalPointsField.setText(java.lang.Integer.toString(assignment.getMaxPoints()));
}