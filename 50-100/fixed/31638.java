private void populateHours() {
    try {
        int hours;
        hours = volunteerModel.getTodaysHours(volunteer.getId(), new java.util.Date(), selectedGuild.getId());
        if (hours >= 0) {
            isHourSet = true;
        }else {
            isHourSet = false;
            hours = 0;
        }
        txtHours.setText(("" + hours));
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(frivilligetimer.gui.controller.AddVolunteerHoursController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}