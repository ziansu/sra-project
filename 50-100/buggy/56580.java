public void addStudent(datamanagement.IStudent student) {
    studentComboBoxModel.addElement((((((student.getID().toString()) + " : ") + (student.getFirstName())) + " ") + (student.getLastName())));
}