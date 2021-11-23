@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    classToEnrollStr = ((java.lang.String) (classToEnrollComboBox.getSelectedItem()));
    enrollResultsTextArea.setText("");
    if (!(classToEnrollStr.equals(""))) {
        enrollClassOK = true;
    }else {
        enrollErrorTextArea.setText("That is not a valid entry. Please choose a Student to Enroll and a Class and click the Enroll Student Button.");
        enrollResultsTextArea.setText("");
    }
}