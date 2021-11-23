private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    setPrintersVisible(false);
    java.lang.String idString = studentIdString.getText();
    if ((idString.length()) != 7) {
        errorIdLabel.setText("USER ID must be 7 digits");
    }else {
        if (ObjectLabEnterpriseSoftware.UtilController.userIDExist(idString)) {
            errorIdLabel.setText("");
            dispose();
            studentSys.studentSubmissionStart(idString);
        }else {
            errorIdLabel.setText("USER ID does not exist");
        }
    }
}