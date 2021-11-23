@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    studentToEnrollStr = ((java.lang.String) (enrollStudentComboBox.getSelectedItem()));
    enrollErrorTextArea.setText("");
    enrollResultsTextArea.setText("");
    java.lang.System.out.println(("trying to verify student to enroll " + (studentToEnrollStr)));
    if (!(studentToEnrollStr.equals(""))) {
        enrollStudentOK = true;
    }else {
        enrollErrorTextArea.setText("That is not a valid entry. Please choose a Student to Enroll and a Class and click the Enroll Student Button.");
        enrollResultsTextArea.setText("");
    }
}