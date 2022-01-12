private void setFirstDate() {
    firstDate = dateFirstDate.getValue();
    if (((dateSecondDate.getValue()) != null) && ((firstDate) != null)) {
        try {
            getAllAbsence(firstDate, secondDate);
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(attendance.gui.controller.TeacherViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}