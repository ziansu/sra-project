protected void updateTimes() {
    if (_isStartTimeModified) {
        _newAppointment.setStartTime(_calendarTime.get(java.util.Calendar.HOUR_OF_DAY), _calendarTime.get(java.util.Calendar.MINUTE));
        _txtStartTime.setText(_newAppointment.getFormattedStartTime());
        _txtEndTime.setText(_newAppointment.getFormattedEndTime());
    }else {
        _newAppointment.setEndTime(_calendarTime.get(java.util.Calendar.HOUR_OF_DAY), _calendarTime.get(java.util.Calendar.MINUTE));
        _txtEndTime.setText(_newAppointment.getFormattedEndTime());
    }
}