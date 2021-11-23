protected void updateTimes() {
    if (_isStartTimeModified) {
        _newAppointment.setStartTime(_calendarTime);
        _txtStartTime.setText(_newAppointment.getFormattedStartTime());
        _txtEndTime.setText(_newAppointment.getFormattedEndTime());
    }else {
        _newAppointment.setEndTime(_calendarTime);
        _txtEndTime.setText(_newAppointment.getFormattedEndTime());
    }
}