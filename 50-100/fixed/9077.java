private void setSecondDate() {
    secondDate = dateSecondDate.getValue();
    if (((dateFirstDate.getValue()) != null) && ((secondDate) != null)) {
        try {
            getAllAbsence(firstDate, secondDate);
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(attendance.gui.controller.TeacherViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}