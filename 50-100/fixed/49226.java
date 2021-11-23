public com.example.mateus.appointmentbook.model.Student getStudent() {
    student.setName(nameField.getText().toString());
    student.setAddress(addressField.getText().toString());
    student.setPhone(phoneField.getText().toString());
    student.setSite(siteField.getText().toString());
    student.setRate(java.lang.Double.valueOf(rateField.getProgress()));
    return student;
}