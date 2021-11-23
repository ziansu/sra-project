@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((enrollStudentOK) & (enrollClassOK)) {
        enrollStudent();
    }else {
        enrollErrorTextArea.setText("That is not a valid entry. Please choose a Student to Enroll and a Class and click the Enroll Student Button.");
    }
}