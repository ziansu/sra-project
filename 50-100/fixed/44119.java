public java.lang.String pinLogin(volunteer.be.Staff staff, java.lang.String pin) {
    java.lang.String failMessage = "";
    if (staff.getPin().equals(pin)) {
        try {
            stage.close();
            volunteer.openAdmin();
        } catch (java.lang.Exception ex) {
            java.util.logging.Logger.getLogger(volunteer.gui.model.LoginModel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        stage.close();
    }else {
        failMessage = "Wrong pin!";
    }
    return failMessage;
}