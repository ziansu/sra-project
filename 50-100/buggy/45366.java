private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {
    setPrintersVisible(false);
    int id;
    java.lang.String idString = studentIdString.getText();
    id = java.lang.Integer.parseInt(idString);
    if ((idString.length()) != 7) {
        errorIdLabel.setText("USER ID must be 7 digits");
    }else
        if (ObjectLabEnterpriseSoftware.UtilController.userIDExist(id)) {
            errorIdLabel.setText("");
            dispose();
            studentSys.studentSubmissionStart(id);
        }else {
            errorIdLabel.setText("USER ID does not exist");
        }
    
}