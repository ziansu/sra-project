public void addStudent(datamanagement.IStudent student) {
    studentComboBoxModel.addElement((((((student.getId().toString()) + " : ") + (student.getFirstName())) + " ") + (student.getLastName())));
}