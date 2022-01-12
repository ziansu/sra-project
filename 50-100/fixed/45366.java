private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    setPrintersVisible(false);
    int id;
    java.lang.String idString = studentIdString.getText();
    if ((idString.length()) != 7) {
        errorIdLabel.setText("USER ID must be 7 digits");
    }else {
        id = java.lang.Integer.parseInt(idString);
        if (ObjectLabEnterpriseSoftware.UtilController.userIDExist(id)) {
            errorIdLabel.setText("");
            dispose();
            studentSys.studentSubmissionStart(id);
        }else {
            errorIdLabel.setText("USER ID does not exist");
        }
    }
}